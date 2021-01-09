package JotunbaneLab.WarehouseApp.model.entity;

import lombok.*;
import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Entity
@PrimaryKeyJoinColumn(name = "id")
@Setter
@Getter
@NoArgsConstructor @AllArgsConstructor
public class Client extends User implements Serializable {
//    @Id
//    private long id;
    private String name;
    private String adress;
    @ManyToOne
    private Trader trader;
    @OneToMany(mappedBy = "client")
    private List<Order> orders;


}
