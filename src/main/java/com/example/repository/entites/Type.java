package com.example.repository.entites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Type {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long value;
        private String label;

    }
