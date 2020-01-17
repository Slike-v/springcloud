package com.server.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusController {

    @PostMapping(value = "/busM",produces = "application/json")
    public String bus(){
        System.out.println("bus-----------test");
        return "bus";
    }
}
