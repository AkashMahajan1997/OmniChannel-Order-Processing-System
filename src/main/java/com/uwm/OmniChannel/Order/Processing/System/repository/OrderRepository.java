package com.uwm.OmniChannel.Order.Processing.System.repository;

import com.uwm.OmniChannel.Order.Processing.System.entity.OrderDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderDto,String> {
}
