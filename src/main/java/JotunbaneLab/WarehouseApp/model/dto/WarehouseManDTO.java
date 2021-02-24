package JotunbaneLab.WarehouseApp.model.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WarehouseManDTO {
    private Long id;
    private String name;
//    private List<OrderDTO> orderList;
    private String password;
    private String role;
    private String login;

}
