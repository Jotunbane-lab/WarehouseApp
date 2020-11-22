package JotunbaneLab.WarehouseApp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private int weight;
    @ManyToOne
    private StoragePlace storingPlace;
    private boolean isReserved;

    @ManyToOne
    private Order order;
}
