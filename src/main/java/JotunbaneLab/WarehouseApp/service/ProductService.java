package JotunbaneLab.WarehouseApp.service;

import JotunbaneLab.WarehouseApp.model.Product;
import JotunbaneLab.WarehouseApp.model.StoragePlace;
import JotunbaneLab.WarehouseApp.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    ProductRepository productRepository;

    public StoragePlace checkStoringPlaceAtLevel0(Product product){
        return null;
    }


}
