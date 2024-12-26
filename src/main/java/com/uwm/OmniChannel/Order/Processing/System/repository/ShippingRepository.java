package com.uwm.OmniChannel.Order.Processing.System.repository;

import com.uwm.OmniChannel.Order.Processing.System.entity.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepository extends JpaRepository<Shipping,String> {
}
