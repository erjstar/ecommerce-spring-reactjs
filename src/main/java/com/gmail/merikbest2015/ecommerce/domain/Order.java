package com.gmail.merikbest2015.ecommerce.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double totalPrice;
    private LocalDate date;
    private String firstName;
    private String lastName;
    private String city;
    private String address;
    private String email;
    private String phoneNumber;
    private Integer postIndex;

    @OrderColumn
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Perfume> perfumeList;

    @ManyToOne
    private User user;

    public Order() {
        this.date = LocalDate.now();
        this.perfumeList = new ArrayList<>();
    }
}
