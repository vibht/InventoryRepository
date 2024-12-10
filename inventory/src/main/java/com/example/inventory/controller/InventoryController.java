package com.example.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventory.models.Inventory;
import com.example.inventory.service.InventoryService;

@RestController
public class InventoryController {
    @Autowired
    private InventoryService service;

    public boolean isInStock(String skuCode){
        boolean stock = service.isInStock(skuCode);
        return stock;


    }


    @GetMapping("getSpecificInventory/{inventoryId}")
    public Inventory getInventory(@PathVariable("inventoryId") Long inventoryId ){
        Inventory inventory = service.getSpecificInventory(inventoryId);

        return inventory;
        
    }

    @GetMapping("getSpecificInventoryFromSkuCode/{skuCode}")
    public Inventory getInventoryFromSkuCode(@PathVariable("skuCode") String skuCode ){
        Inventory inventory = service.getSpecificInventoryFromskuCode(skuCode);

        return inventory;
        
    }
    
}
