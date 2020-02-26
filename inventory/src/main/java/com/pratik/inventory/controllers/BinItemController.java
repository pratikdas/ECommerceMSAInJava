package com.pratik.inventory.controllers;


import com.pratik.inventory.controllers.requests.CreateBinItemRequest;
import com.pratik.inventory.controllers.responses.CreateBinItemResponse;
import com.pratik.inventory.models.Bin;
import com.pratik.inventory.services.BinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("binitems")
public class BinItemController {

    private BinService binService;

    @Autowired
    public BinItemController(BinService binService){
        this.binService = binService;
    }



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Bin> getBins(){

        return new ArrayList<>();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public CreateBinItemResponse createBinItem(CreateBinItemRequest request){
        CreateBinItemResponse createBinItemResponse = new CreateBinItemResponse();

        return createBinItemResponse;
    }
    

}
