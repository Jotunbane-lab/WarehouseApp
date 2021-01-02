package JotunbaneLab.WarehouseApp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoragePlaceDTO {

    private Long id;
    private List<ProductDTO> products;
    private int rackNumber;
    private int level;
    private List<OrderDTO> storedOrders;
}
