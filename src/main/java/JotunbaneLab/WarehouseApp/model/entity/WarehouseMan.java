package JotunbaneLab.WarehouseApp.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WarehouseMan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "warehouseMan")
    private List<Order> orderList;
    private String password;
    private String role;

}
