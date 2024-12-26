package com.uwm.OmniChannel.Order.Processing.System.entity;

public enum OrderStatus {
    CREATE("Order Created"),SCHEDULE("Order Schedule"),SHIPPED("ORDER Shipped");

    String status;
    OrderStatus(String status){
        this.status = status;
    }
}
