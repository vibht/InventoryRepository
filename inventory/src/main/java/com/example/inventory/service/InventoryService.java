package com.example.inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inventory.models.Inventory;
import com.example.inventory.repository.InventoryRepository;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public boolean isInStock(String skuCode) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isInStock'");
    }

    public Inventory getSpecificInventory(Long inventoryId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSpecificInventory'");
    }

    public Inventory getSpecificInventoryFromskuCode(String skuCode) {
        return inventoryRepository.findBySkuCode(skuCode).get();
        
        
    }
    
}
