package com.pratik.inventory.controllers;

import com.pratik.inventory.models.Bin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("inventorytxn")
public class InventoryTxnController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Bin> getBins(){

        return new ArrayList<>();
    }
}
