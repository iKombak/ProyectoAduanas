package com.mycompany.parkingaduanas.logica;

import javax.persistence.*;
import javax.swing.ImageIcon;

@Entity
public class Funcionario {
    //ATRIBUTOS

    @Id
    private String CI;
    
    @Basic
    private String nombre;
    private String apellido;
    private String CorreoElectronico;
    private String Telefono;
    private ImageIcon foto;
    
    
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
        this.foto = foto;
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


    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }


    

    
    
    



    

    
}
