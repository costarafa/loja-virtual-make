package com.dev.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.backend.entity.Permissao;
import com.dev.backend.service.PermissaoService;

@RestController
@RequestMapping("/api/permissao")
public class PermissaoController {
    
    @Autowired
    private PermissaoService permissaoService;

    public List<Permissao> buscarTodas(){
        return permissaoService.buscarTodas();
    }

    public Permissao inserir(@RequestBody Permissao permissao){
        return permissaoService.alterar(permissao);
    }
    
    public Permissao alterar(@RequestBody Permissao permissao){
        return permissaoService.alterar(permissao);
    }

    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        permissaoService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
