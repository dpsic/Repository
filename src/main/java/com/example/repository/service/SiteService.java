package com.example.repository.service;

import com.example.repository.entites.Site;

import java.util.List;

public interface SiteService {
    Site ajouter(Site site);
    Site getSiteById(Long id);
    List<Site> getAllSite();
    void SupprimerSite(Long id);
}
