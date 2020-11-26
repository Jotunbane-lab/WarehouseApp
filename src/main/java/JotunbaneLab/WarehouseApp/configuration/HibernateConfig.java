package JotunbaneLab.WarehouseApp.configuration;

import JotunbaneLab.WarehouseApp.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Properties;

public class HibernateConfig {
    private static SessionFactory sessionFactory = sessionFactory();

    public static SessionFactory sessionFactory(){
        if(sessionFactory != null) { return sessionFactory;}

        StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
        registryBuilder.applySettings(readProperties());
        StandardServiceRegistry serviceRegistry = registryBuilder.build();

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Client.class);
        cfg.addAnnotatedClass(Order.class);
        cfg.addAnnotatedClass(Product.class);
        cfg.addAnnotatedClass(StoragePlace.class);
        cfg.addAnnotatedClass(Trader.class);
        cfg.addAnnotatedClass(WarehouseMan.class);
        sessionFactory = cfg.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }

    private static Properties readProperties() {
        Properties properties = new Properties();
        try{
            properties.load(HibernateConfig.class.getResourceAsStream("/dao.properties"));
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return properties;
    }
}
