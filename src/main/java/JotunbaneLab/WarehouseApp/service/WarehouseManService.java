package JotunbaneLab.WarehouseApp.service;

import JotunbaneLab.WarehouseApp.model.dto.ClientDTO;
import JotunbaneLab.WarehouseApp.model.dto.WarehouseManDTO;
import JotunbaneLab.WarehouseApp.model.entity.Order;
import JotunbaneLab.WarehouseApp.model.entity.Product;
import JotunbaneLab.WarehouseApp.model.entity.StoragePlace;
import JotunbaneLab.WarehouseApp.model.entity.WarehouseMan;
import JotunbaneLab.WarehouseApp.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WarehouseManService {

    UserRepository userRepository;
    ModelMapper modelMapper;

    public WarehouseManService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
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


    public List<WarehouseManDTO> getAllWarehousemans() {
        return userRepository.findAll()
                .stream()
                .filter(o -> o.getRole().equals("ROLE_WAREHOUSEMAN"))
                .map(warehouseman -> modelMapper.map(warehouseman, WarehouseManDTO.class))
                .collect(Collectors.toList());
    }

    public void addWarehouseman(WarehouseManDTO warehouseManDTO) {
        System.out.println("Adding WarehouseMan named: " + warehouseManDTO.getName());
        WarehouseMan warehouseMan = modelMapper.map(warehouseManDTO, WarehouseMan.class);
        userRepository.save(warehouseMan);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
