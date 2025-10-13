/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingaduanas.logica;

import com.mycompany.parkingaduanas.persistencia.ControladoraPersistencia;

/**
 *
 * @author enzo
 */
public class Controladora {
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();

    public void guardar(String CI, String nombre, String apellido, String correo, String telefono) {
       
        Funcionario func = new Funcionario();
        func.setCI(CI);
        func.setNombre(nombre);
        func.setApellido(apellido);
        func.setCorreoElectronico(correo);
        func.setTelefono(telefono);
        
        controlPersistencia.guardar(func);
    }
    
}
