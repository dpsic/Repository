package com.example.repository.dao;

import com.example.repository.entites.Site;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteRepo extends JpaRepository<Site,Long> {
}
