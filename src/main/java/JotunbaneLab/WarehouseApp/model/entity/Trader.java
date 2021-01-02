package JotunbaneLab.WarehouseApp.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Trader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "id")
    private List<Order> orderList;
    @OneToMany(mappedBy = "trader")
    private List<Client> clients;
    private String password;
}
