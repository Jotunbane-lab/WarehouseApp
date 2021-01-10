package JotunbaneLab.WarehouseApp.service;

import JotunbaneLab.WarehouseApp.model.entity.Order;
import JotunbaneLab.WarehouseApp.model.entity.Product;
import JotunbaneLab.WarehouseApp.model.entity.StoragePlace;
import JotunbaneLab.WarehouseApp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class WarehouseManService {

    UserRepository userRepository;


    public WarehouseManService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void takeOrder(Order order, Long warehouseManId){
        Long orderId = order.getId();
    }

    public Long getIdByLogin(String login){
        return 0L;
    }

    public void moveProducts(Product product){}

    public void scanProduct(String ean){}

    public void checkStoragePlace(StoragePlace storagePlace){}

    public void checkStocks(){}

    public void checkProductStock(Product product){}

    public void moveOrders(Order order){}

    public void chooseActiveOrder(Order order){}

    public void viewMyOrders(){}




}
