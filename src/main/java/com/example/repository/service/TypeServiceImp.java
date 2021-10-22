package com.example.repository.service;

import com.example.repository.dao.TypeRepo;
import com.example.repository.entites.Type;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeServiceImp implements TypeService{
    TypeRepo typeRepo;
    @Override
    public Type ajouter(Type type) {
        return typeRepo.save(type);
    }

    @Override
    public Type getTypeById(Long id) {
        return typeRepo.findById(id).get();
    }

    @Override
    public List<Type> getAllType() {
        return typeRepo.findAll();
    }

    @Override
    public void SupprimerType(Long id) {
typeRepo.deleteById(id);
    }
}
