package com.example.repository.entites;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long value;
    // fileLink & file
    private String fileLink;
    @Transient
    private MultipartFile file;
    @ManyToOne
    @JoinColumn(name = "ID_SITE")
    private Site site;
    @ManyToOne
    @JoinColumn(name = "ID_TYPE")
    private Type type;
    // create date
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(updatable = false)
    private Date createDate;
    // update date
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(updatable = true)
    private Date updateDate;
    private String title;
    @PrePersist
    protected void Creat() {
        this.createDate= new Date();
    }
  @PreUpdate
    protected void onUpdate() {
    this.updateDate= new Date();
}
}
