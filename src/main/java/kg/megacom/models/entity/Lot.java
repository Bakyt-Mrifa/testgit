package kg.megacom.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="lots")
public class Lot {
    @Id
    @GeneratedValue
    @Column(name="lot_id")
    private Long id;
    private String name;
    private double minPrice;
    private double priceForBuy;

    private double step;

    private Date startDate;
    private Date endDate;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "status_id")
    private Status status;

}
