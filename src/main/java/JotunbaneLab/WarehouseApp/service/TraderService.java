package JotunbaneLab.WarehouseApp.service;

import JotunbaneLab.WarehouseApp.model.entity.Product;
import JotunbaneLab.WarehouseApp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraderService {
    UserRepository userRepository;

    public boolean createOrder(List<Product> products){

        return false;
    }

    public boolean deleteOrder(Long orderId){
        return false;
    }

    public boolean addComment(Long orderId){
        return false;
    }

    public List<Product> getStocks(){
        return  null;
    }


}
