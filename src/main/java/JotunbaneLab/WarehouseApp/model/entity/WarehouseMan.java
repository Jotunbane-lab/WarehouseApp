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
public class WarehouseMan extends User implements Serializable {

    private String name;
    @OneToMany(mappedBy = "warehouseMan")
    private List<Order> orderList;
}
