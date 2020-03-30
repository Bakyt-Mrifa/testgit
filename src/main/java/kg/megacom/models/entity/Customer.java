package kg.megacom.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="costumers")
public class Customer {

    @Id
    @GeneratedValue
    @Column(name="customer_id")
    private Long id;
    private String phone;
}
