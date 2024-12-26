package com.uwm.OmniChannel.Order.Processing.System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Inventory")
public class Inventory {
    @Id
    private String itemID;

    private String itemName;

    private String quantity;


}
