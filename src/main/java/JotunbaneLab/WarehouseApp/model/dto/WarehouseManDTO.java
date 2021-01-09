package JotunbaneLab.WarehouseApp.model.dto;

import JotunbaneLab.WarehouseApp.model.entity.Order;
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
public class WarehouseManDTO {
    private Long id;
    private String name;
    private List<Order> orderList;
    private String password;
    private String role;

}
