package com.pratik.inventory.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Bin {
    private String binID;
    private String name;
    private String description;
    private String channel;
    private List<BinItem> items;
    private String parentBinID;
    private boolean leafBean;
}
