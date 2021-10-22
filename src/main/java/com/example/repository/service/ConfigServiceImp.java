package com.example.repository.service;

import com.example.repository.dao.ConfigRepo;
import com.example.repository.entites.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ConfigServiceImp implements ConfigService{
    @Autowired
    ConfigRepo configRepo;
    @Override
    public Config ajouter(Config config) {
        return configRepo.save(config);
    }

    @Override
    public Config getConfigById(Long id) {
        return configRepo.findById(id).get();
    }

    @Override
    public List<Config> getAllConfig() {
        return configRepo.findAll();
    }

    @Override
    public void SupprimerConfig(Long id) {
configRepo.deleteById(id);
    }
}
