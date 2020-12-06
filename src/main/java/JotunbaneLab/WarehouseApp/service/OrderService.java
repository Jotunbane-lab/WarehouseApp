package JotunbaneLab.WarehouseApp.service;


import JotunbaneLab.WarehouseApp.model.entity.Order;
import JotunbaneLab.WarehouseApp.model.entity.Product;
import JotunbaneLab.WarehouseApp.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    OrderRepository orderRepository;

    public void createOrder(List<Product> productList){}

    public Optional<Order> findOrderById(Long id){
        return orderRepository.findById(id);
    }
    
    public void saveWarehouseManIntoOrder(Long id){
        findOrderById(id);
    }


}
