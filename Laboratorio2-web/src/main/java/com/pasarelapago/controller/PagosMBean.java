/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasarelapago.controller;

import com.pasarelapago.entity.Pagos;
import com.pasarelapago.session.PagosManagerLocal;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author andre
 */
public class PagosMBean {

    @EJB
    private PagosManagerLocal pagosManager;

    public PagosMBean() {
    }

    private Pagos pago; //para mostrar, actualizar o insertar en el formulario
    private List<Pagos> pagos; //para visualizar en la tabla

//retorna una lista de clientes para mostrar en un datatable de JSF
    public List<Pagos> getPagos() {
        if ((pagos == null) || (pagos.isEmpty())) {
            refresh();
        }
        return pagos;
    }
//Retorna el detalle de cada cliente en el formulario.

    public Pagos getDetails() {
        return pago;
    }

    /**
     * Action handler - llamado cuando en una fila de la tabla se haga click en
     * ID
     *
     * @param pago
     * @return
     */
    public String showDetails(Pagos pago) {
        this.pago = pago;
        return "DETAILS"; // Permite enlazar a CustomerDetails.xml
    }

    /**
     * Profundización en Arquitectura de Software - Universidad de Antioquia
     * Action handler - Actualiza el modelo Customer en la BD. Se llama cuando
     * se presiona el boton update del formulario
     *
     * @return
     */
    public String update() {
        System.out.println("###UPDATE###");
        pago = pagosManager.update(pago);
        return "SAVED"; // Para el caso navegacional
    }

    /**
     * Action handler - returno hacia la vista de la lista de clientes
     *
     * @return
     */
    public String list() {
        System.out.println("###LIST###");
        return "LIST";
    }

    private void refresh() {
        pagos = pagosManager.getAllPagos();
    }
}
