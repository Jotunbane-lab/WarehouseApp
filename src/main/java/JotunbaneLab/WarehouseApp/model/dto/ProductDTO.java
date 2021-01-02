package JotunbaneLab.WarehouseApp.model.dto;

import JotunbaneLab.WarehouseApp.model.dto.StoragePlaceDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Long id;
    private String productName;
    private int weight;
    private StoragePlaceDTO storingPlace;
    private boolean isReserved;
    private boolean isAddedToOrder;
    private OrderDTO order;
}
