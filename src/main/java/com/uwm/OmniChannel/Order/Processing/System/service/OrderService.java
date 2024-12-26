package com.uwm.OmniChannel.Order.Processing.System.service;

import com.uwm.OmniChannel.Order.Processing.System.entity.OrderDto;
import com.uwm.OmniChannel.Order.Processing.System.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderDto createOrder(OrderDto orderDto){
        return orderRepository.save(orderDto);
    }
    public OrderDto findOrderByID(String id)
    {
        return orderRepository.findById(id).get();
    }
}
