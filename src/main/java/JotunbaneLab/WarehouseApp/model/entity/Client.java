package JotunbaneLab.WarehouseApp.model.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@Setter
@Getter
@NoArgsConstructor @AllArgsConstructor
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String adress;
    @ManyToOne
    private Trader hisTrader;
    @OneToMany(mappedBy = "client")
    private List<Order> orders;


}
