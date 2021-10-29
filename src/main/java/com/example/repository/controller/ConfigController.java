package com.example.repository.controller;

import com.example.repository.entites.Config;
import com.example.repository.entites.Site;
import com.example.repository.exceptions.LibbeleException;
import com.example.repository.service.ConfigService;
import com.example.repository.service.MapVAlidationErrorService;
import com.example.repository.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
@RestController
public class ConfigController {
    @Autowired
    ConfigService configService;
    @Value("${file.upload-event}")
    private String path;
    @Autowired
    MapVAlidationErrorService mapVAlidationErrorService;
    @PostMapping(path="configs")
    public ResponseEntity<?> create(@RequestPart(required = true) Config co,
                                          @RequestPart(value = "file", required = false) final MultipartFile file) {


        co.setFileLink(file.getOriginalFilename());
        Config config = configService.ajouter(co);
        if (!file.isEmpty()) {
            try {
                Files.write(Paths.get(path + "\\" + config.getValue() + "_" + config.getFileLink()), file.getBytes());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return new ResponseEntity<String>("bay", HttpStatus.OK);

    }



    @GetMapping(path = "/configs/{id}")
    public Config getConfig(@PathVariable(name = "id") Long id){
        return configService.getConfigById(id);
    }

    @GetMapping(path = "/configs")
    public List<Config> allConfig(){
        return configService.getAllConfig();
    }

    @DeleteMapping(path = "/configs/{id}")
    public void deleteconfig(@PathVariable(name = "id") Long id){
        configService.SupprimerConfig(id);
    }
}
