package model;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

public class Client {
    private Long id;
    private String name;
    private String Adress;
    @ManyToOne
    private Long hisTraderId;
    @OneToMany(mappedBy = "clientId")
    private List<Order> orders;
}
