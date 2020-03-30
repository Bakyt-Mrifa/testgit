package kg.megacom.models.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue
    @Column(name="user_id")
    private Long id;
    private String name;
    private String login;
    private String password;


}
