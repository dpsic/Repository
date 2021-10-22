package com.example.repository.dao;

import com.example.repository.entites.Config;
import com.example.repository.entites.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigRepo extends JpaRepository<Config,Long> {
}
