package com.uwm.OmniChannel.Order.Processing.System.controller;

import com.uwm.OmniChannel.Order.Processing.System.entity.OrderDto;
import com.uwm.OmniChannel.Order.Processing.System.service.OrderService;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDto> saveOrder(@RequestBody OrderDto orderDto){
        OrderDto createdOrder = orderService.createOrder(orderDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
    }

    @GetMapping("order/{id}")
    public ResponseEntity<OrderDto> getOrderById(@PathVariable String id){
      return  ResponseEntity.ok(orderService.findOrderByID(id));
    }

}
