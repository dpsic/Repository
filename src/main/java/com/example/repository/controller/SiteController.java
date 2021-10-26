package com.example.repository.controller;

import com.example.repository.entites.Site;
import com.example.repository.entites.Type;
import com.example.repository.service.SiteService;
import com.example.repository.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SiteController {
    @Autowired
    SiteService siteService;

    @PostMapping("/sites")
    public Site saveSite(@RequestBody Site site){
        return siteService.ajouter(site);
    }

    @GetMapping(path = "/sites/{id}")
    public Site getSite(@PathVariable(name = "id") Long id){
        return siteService.getSiteById(id);
    }

    @GetMapping(path = "/sites")
    public List<Site> allSite(){
        return siteService.getAllSite();
    }

    @DeleteMapping(path = "/sites/{id}")
    public void deleteSite(@PathVariable(name = "id") Long id){
       siteService.SupprimerSite(id);
    }
}
