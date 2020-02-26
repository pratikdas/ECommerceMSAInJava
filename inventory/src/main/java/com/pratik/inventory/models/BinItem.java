package com.pratik.inventory.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BinItem {
    private String binID;
    private String skuID;
    private int atpQuantity;
    private int backOrderedQuantity;
    private int outOfStockThreshold;
    private int lowStockThreshold;

}
