package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
public class HistoriqueAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Utilisateur utilisateur;
    
    @Column(nullable = false)
    private String action;


    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date date;
}