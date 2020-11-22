package model;

import javax.persistence.*;
import java.util.List;
@Entity
public class Client {
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
