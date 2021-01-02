package JotunbaneLab.WarehouseApp.model.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class OrderDTO {
    private Long id;
    private TraderDTO trader;
    private ClientDTO client;
    private WarehouseManDTO warehouseMan;
    private List<ProductDTO> productList;
    private String comment;
    private StoragePlaceDTO storingPlace;
    private boolean isDone;

}
