package com.uwm.OmniChannel.Order.Processing.System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shipping {
    @Id
    private String shippingId;

    @OneToMany
    private List<OrderDto> orderNumber;


}
