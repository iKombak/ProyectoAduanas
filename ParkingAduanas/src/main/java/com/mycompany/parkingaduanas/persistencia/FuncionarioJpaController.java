/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingaduanas.persistencia;

import com.mycompany.parkingaduanas.logica.Funcionario;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Brian
 */
public class FuncionarioJpaController {

    private EntityManagerFactory emf = null;

    public FuncionarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public FuncionarioJpaController() {
        emf = Persistence.createEntityManagerFactory("PersistenciaADUANA");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // ---------------- MÉTODOS CRUD ----------------
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

    public void edit(Funcionario funcionario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            funcionario = em.merge(funcionario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            throw new RuntimeException("Error al modificar el funcionario: " + ex.getMessage(), ex);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String CI) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Funcionario funcionario;
            try {
                funcionario = em.getReference(Funcionario.class, CI);
                funcionario.getCI(); // Fuerza la carga del objeto
            } catch (EntityNotFoundException enfe) {
                throw new RuntimeException("El funcionario con CI " + CI + " no existe.", enfe);
            }
            em.remove(funcionario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // ---------------- MÉTODOS DE CONSULTA ----------------
    public List<Funcionario> findFuncionarioEntities() {
        return findFuncionarioEntities(true, -1, -1);
    }

    public List<Funcionario> findFuncionarioEntities(int maxResults, int firstResult) {
        return findFuncionarioEntities(false, maxResults, firstResult);
    }

    private List<Funcionario> findFuncionarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Funcionario.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Funcionario findFuncionario(String CI) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Funcionario.class, CI);
        } finally {
            em.close();
        }
    }

    public int getFuncionarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Funcionario> rt = cq.from(Funcionario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
