package com.example.repository.service;

import com.example.repository.entites.Config;
import com.example.repository.entites.Site;

import java.util.List;

public interface ConfigService {
    Config ajouter(Config config);
    Config getConfigById(Long id);
    List<Config> getAllConfig();
    void SupprimerConfig(Long id);
}
