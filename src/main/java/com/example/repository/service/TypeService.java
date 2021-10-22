package com.example.repository.service;

import com.example.repository.entites.Type;

import java.util.List;

public interface TypeService {
    Type ajouter(Type type);
    Type getTypeById(Long id);
    List<Type>  getAllType();
    void SupprimerType(Long id);

}
