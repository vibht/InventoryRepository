package com.example.inventory.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.inventory.models.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    Optional<Inventory> findBySkuCode(String skuCode);
    
    // public Inventory FindBykuCode(String skuCode) {
    // Optional<Inventory> aa = inventoryRepository.findBySkuCode(skuCode)
    // .orElseThrow(() -> new RuntimeException("Inventory not found for skuCode: " +
    // skuCode));

    // }

}
