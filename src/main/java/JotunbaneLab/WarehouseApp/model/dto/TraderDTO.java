package JotunbaneLab.WarehouseApp.model.dto;

import JotunbaneLab.WarehouseApp.model.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TraderDTO {
    private Long id;
    private String name;
    private List<Order> orderList;
    private List<ClientDTO> clients;
    private String password;
}
