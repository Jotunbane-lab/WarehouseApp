package JotunbaneLab.WarehouseApp.model.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "warehouse_man")
public class WarehouseMan extends User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
    private String role;

    private String name;
    @OneToMany(mappedBy = "warehouseMan")
    private List<Order> orderList;

}
