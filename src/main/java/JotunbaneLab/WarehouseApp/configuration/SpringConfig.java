package JotunbaneLab.WarehouseApp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"configuration", "service"})
@EnableJpaRepositories("repository")
@EnableTransactionManagement
public class SpringConfig {

    @Bean
    public DataSource getDateSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/WarehouseApp");
        dataSource.setUsername("postgres");
        dataSource.setPassword("Ugauga66!!");

        return dataSource;
    }


}
