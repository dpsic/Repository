package com.example.repository.controller;

import com.example.repository.entites.Type;
import com.example.repository.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TypeController {
    @Autowired
    TypeService typeService;

    @PostMapping(path = "/types")
    public Type saveType(Type type){
        return typeService.ajouter(type);
    }

    @GetMapping(path = "/types/{id}")
    public Type getType(@PathVariable(name = "id") Long id){
        return typeService.getTypeById(id);
    }

    @GetMapping(path = "/types")
    public List<Type> allTypes(){
        return typeService.getAllType();
    }

    @DeleteMapping(path = "/types/{id}")
    public void deleteType(@PathVariable(name = "id") Long id){
        typeService.SupprimerType(id);
    }
}
