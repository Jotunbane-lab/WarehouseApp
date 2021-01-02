package JotunbaneLab.WarehouseApp.model.dto;

import JotunbaneLab.WarehouseApp.model.entity.Order;
import JotunbaneLab.WarehouseApp.model.entity.Trader;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor @AllArgsConstructor
public class ClientDTO {
    private Long id;
    private String name;
    private String adress;
    private TraderDTO trader;
    private List<Order> orders;
    private String password;


}
