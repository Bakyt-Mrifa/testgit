package kg.megacom.models.entity;

import javax.persistence.*;
import java.time.LocalDate;

public class Lot {
    @Id
    @GeneratedValue
    @Column(name="lot_id")
    private Integer id;
    private String name;
    private double minPrice;
    private double priceFotBuy;

    private double step;

    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

}
