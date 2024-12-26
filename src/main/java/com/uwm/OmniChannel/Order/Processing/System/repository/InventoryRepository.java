package com.uwm.OmniChannel.Order.Processing.System.repository;

import com.uwm.OmniChannel.Order.Processing.System.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, String> {
}
