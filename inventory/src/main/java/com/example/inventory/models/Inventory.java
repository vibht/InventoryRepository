package com.example.inventory.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Inventory {
    @Id
    private Long id;
    private String skuCode;
    private Integer qty;
}
