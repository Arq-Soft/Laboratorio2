/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasarelapago.session;

import com.pasarelapago.entity.Pagos;
import com.sun.net.httpserver.HttpsServer;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.faces.validator.Validator;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

/**
 *
 * @author andre
 */
@Stateless
public class PagosManager implements PagosManagerLocal {

    @PersistenceContext(unitName = "com.pasarelapago_Laboratorio2-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    public List<Pagos> getAllPagos() {
        Query query = em.createNamedQuery("Pagos.findAll");
        return query.getResultList();
    }

    @Override
    public Pagos update(Pagos pagos) {

        try {
            return em.merge(pagos);
        } catch (Exception e) {
            System.out.println("No hay datos" + e);
            return null;
        }

    }

    @Override
    public Pagos crear(Pagos pagos) {
        try {
            em.persist(pagos);
            System.out.println("GUARDADO CON EXITO");
            return pagos;
        } catch (Exception e) {
            System.out.println("Error al guardar: " + e);
            return pagos;
        }
    }
    
}
