package com.example.repository.service;

import com.example.repository.dao.SiteRepo;
import com.example.repository.entites.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SiteServiceImp implements SiteService{
@Autowired
    SiteRepo siteRepo;
    @Override
    public Site ajouter(Site site) {
        return siteRepo.save(site);
    }

    @Override
    public Site getSiteById(Long id) {
        return siteRepo.findById(id).get();
    }

    @Override
    public List<Site> getAllSite() {
        return siteRepo.findAll();
    }

    @Override
    public void SupprimerSite(Long id) {
siteRepo.deleteById(id);
    }
}
