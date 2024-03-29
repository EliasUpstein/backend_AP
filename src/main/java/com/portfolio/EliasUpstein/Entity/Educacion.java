package com.portfolio.EliasUpstein.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String institucionE;
    private String descripcionE;

    public Educacion() {
    }

    public Educacion(String nombreE, String institucionE, String descripcionE) {
        this.nombreE = nombreE;
        this.institucionE = institucionE;
        this.descripcionE = descripcionE;
    }
}
