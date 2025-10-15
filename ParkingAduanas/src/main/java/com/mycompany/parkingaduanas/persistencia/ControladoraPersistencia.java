/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingaduanas.persistencia;

import com.mycompany.parkingaduanas.logica.Funcionario;
import java.util.List;

/**
 *
 * @author enzo
 */
public class ControladoraPersistencia {
    
    FuncionarioJpaController funcionarioJpa = new FuncionarioJpaController();

    public void guardar(Funcionario func) {
        funcionarioJpa.create(func);
    }

    public List<Funcionario> traerFuncionarios() {
        return funcionarioJpa.findFuncionarioEntities();
    }
    
}
