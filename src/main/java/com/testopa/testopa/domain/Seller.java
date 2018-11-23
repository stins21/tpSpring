package com.testopa.testopa.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.List;

@Entity(name="seller")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Length(min = 0, max = 100)
    private String firstname;
    private String lastname;
    @Column(columnDefinition = "TEXT")
    private String bio;
    @OneToMany(mappedBy = "seller")
    private List<Product> products;

}
