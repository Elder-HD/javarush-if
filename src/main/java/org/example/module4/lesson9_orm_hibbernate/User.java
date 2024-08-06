package org.example.module4.lesson9_orm_hibbernate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.module4.lesson10_hql.Address;
import org.hibernate.type.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "user")
@NamedQueries(
        {
                @NamedQuery(name = "User.findAll", query = "FROM User"),
                @NamedQuery(name = "User.findById",query = "FROM User u WHERE u.id = :id")

        }
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    private String lastName;
    private int age;

    @Column(unique = true)
    private String email;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void sayHello () {
        System.out.println(firstName + " says hello");
    }

}


