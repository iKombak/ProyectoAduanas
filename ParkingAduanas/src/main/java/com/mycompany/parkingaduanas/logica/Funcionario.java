package com.mycompany.parkingaduanas.logica;

import javax.persistence.*;

@Entity
public class Funcionario {
    //ATRIBUTOS
    @Id
    private String CI;
    private String nombre;
    private String apellido;
    private String CorreoElectronico;
    private String Telefono;
    
    //COSTRUCTORES
    //Por Defecto

    public Funcionario() {
    }

    public Funcionario(String CI, String nombre, String apellido, String CorreoElectronico, String Telefono) {
        this.CI = CI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.CorreoElectronico = CorreoElectronico;
        this.Telefono = Telefono;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    
    
    



    

    
}
