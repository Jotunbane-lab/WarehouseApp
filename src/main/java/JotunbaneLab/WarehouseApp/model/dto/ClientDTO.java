package JotunbaneLab.WarehouseApp.model.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor @AllArgsConstructor
public class ClientDTO {
    private Long id;
    private String name;
    private String adress;
    private TraderDTO trader;
   // private List<OrderDTO> orders = new ArrayList<>();
    private String password;
    private String role;


}
