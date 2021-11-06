package com.platzi.projectoplatzi.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @GetMapping("/")
    public String index(){

        return "hola mundo";
    }
}
