package com.dev.backend.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") //cria um mapeamento padrão para chamar  controle
public class Hello {

    @GetMapping("/")
    public String hello(){
        return "Olá mundo Spring" + new Date();
    }  
}
