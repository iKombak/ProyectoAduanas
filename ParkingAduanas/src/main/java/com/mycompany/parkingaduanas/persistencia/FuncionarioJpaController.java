package com.mycompany.parkingaduanas.persistencia;

import com.mycompany.parkingaduanas.logica.Funcionario;
import com.mycompany.parkingaduanas.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FuncionarioJpaController implements Serializable {

    private EntityManagerFactory emf = null;

    public FuncionarioJpaController() {
        // Debe coincidir con el nombre del persistence-unit en tu persistence.xml
        emf = Persistence.createEntityManagerFactory("PersistenciaADUANA");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Crear un nuevo funcionario
    public void create(Funcionario funcionario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(funcionario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Editar un funcionario existente
    public void edit(Funcionario funcionario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            funcionario = em.merge(funcionario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String id = funcionario.getCI();
            if (findFuncionario(id) == null) {
                throw new NonexistentEntityException("El funcionario con CI " + id + " ya no existe.");
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Eliminar un funcionario
    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Funcionario funcionario;
            try {
                funcionario = em.getReference(Funcionario.class, id);
                funcionario.getCI();
            } catch (Exception e) {
                throw new NonexistentEntityException("El funcionario con CI " + id + " ya no existe.", e);
            }
            em.remove(funcionario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    private Object findFuncionario(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
