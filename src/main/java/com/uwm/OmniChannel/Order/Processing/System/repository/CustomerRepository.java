package com.uwm.OmniChannel.Order.Processing.System.repository;

import com.uwm.OmniChannel.Order.Processing.System.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
