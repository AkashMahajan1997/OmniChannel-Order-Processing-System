package com.uwm.OmniChannel.Order.Processing.System.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ItemDetails {

    @Id
    private String ItemID;

    @Column
    private String itemName;

    @Column
    private String itemDescription;

}
