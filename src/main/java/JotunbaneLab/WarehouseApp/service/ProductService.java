package JotunbaneLab.WarehouseApp.service;

import JotunbaneLab.WarehouseApp.model.entity.Product;
import JotunbaneLab.WarehouseApp.model.entity.StoragePlace;
import JotunbaneLab.WarehouseApp.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    ProductRepository productRepository;

    public StoragePlace checkStoringPlaceAtLevel0(Product product){
        return null;
    }


}
