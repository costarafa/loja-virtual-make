package com.dev.backend.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.backend.entity.Marca;
import com.dev.backend.service.MarcaService;

@RestController
@RequestMapping("/api/marca")
public class MarcaController {
    
    @Autowired
    private MarcaService marcaService;

    public List<Marca> buscarTodas(){
        return marcaService.buscarTodas();
    }

    public Marca inserir(@RequestBody Marca marca){
        return marcaService.alterar(marca);
    }
    
    public Marca alterar(@RequestBody Marca marca){
        return marcaService.alterar(marca);
    }

    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        marcaService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
