package com.mycompany.parkingaduanas.logica;

import javax.persistence.*;

@Entity
public class Funcionario {
    //ATRIBUTOS
    @Id
    private String CI;
    private String NombreCompleto;
    private String CorreoElectronico;
    private int Telefono;
    
    //COSTRUCTORES
    //Por Defecto
    
    public Funcionario() {
        this.CI = "9999999999";
        this.NombreCompleto = "Alvaro Recoba";
        this.CorreoElectronico = "decano@cndf.com.uy";
        this.Telefono = 99112233;
    }
    //Especifico
    public Funcionario(String CI, String NombreCompleto, String CorreoElectronico, int Telefono) {
        this.CI = CI;
        this.NombreCompleto = NombreCompleto;
        this.CorreoElectronico = CorreoElectronico;
        this.Telefono = Telefono;
    }
    //GETTERS Y SETTERS
    //Getters
    
    
    //Setters

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }





    

    
}
