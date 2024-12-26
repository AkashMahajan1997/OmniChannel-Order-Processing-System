package com.uwm.OmniChannel.Order.Processing.System.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    @Id
    private String id;

    @Column
    private String status;

    private String quantity;

}
