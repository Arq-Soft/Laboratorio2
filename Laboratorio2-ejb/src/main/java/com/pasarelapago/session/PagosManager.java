/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasarelapago.session;

import com.pasarelapago.entity.Pagos;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
        return em.merge(pagos);
    }
}
