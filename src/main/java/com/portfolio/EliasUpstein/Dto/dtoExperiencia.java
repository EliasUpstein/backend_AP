package com.portfolio.EliasUpstein.Dto;

import jakarta.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String empresaE;
    @NotBlank
    private String descripcionE;
    
    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String empresaE, String descripcionE) {
        this.nombreE = nombreE;
        this.empresaE = empresaE;
        this.descripcionE = descripcionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }
    
    public String getEmpresaE() {
        return empresaE;
    }

    public void setEmpresaE(String empresaE) {
        this.empresaE = empresaE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
}
