package kg.megacom.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "statuses")
public class Status {
    @Id
    @GeneratedValue
    @Column(name="suatus_id")
    private Long id;
    private String name;

}
