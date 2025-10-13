/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingaduanas.logica;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author enzo
 */
@Entity
public class Vehiculos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)        
    int id;
    
    String marca;
    
    String modelo;
    
    String VIN;
    
    String num_Motor;
    
    Date fechaActual;
    
    String departamento;

    public Vehiculos() {
    }

    public Vehiculos(int id, String marca, String modelo, String VIN, String num_Motor, Date fechaActual, String departamento) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.VIN = VIN;
        this.num_Motor = num_Motor;
        this.fechaActual = fechaActual;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getNum_Motor() {
        return num_Motor;
    }

    public void setNum_Motor(String num_Motor) {
        this.num_Motor = num_Motor;
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

   
    
}
