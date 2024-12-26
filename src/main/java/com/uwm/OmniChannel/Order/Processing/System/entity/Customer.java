package com.uwm.OmniChannel.Order.Processing.System.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;

    private String password;

    private String name;

    @OneToMany
    private List<OrderDto> orders;

}
