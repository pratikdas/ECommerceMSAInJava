package com.pratik.inventory.controllers;


import com.pratik.inventory.models.Bin;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("bin")
public class BinController {



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Bin> getBins(){

        return new ArrayList<>();
    }


    

}
