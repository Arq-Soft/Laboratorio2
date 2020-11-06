/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasarelapago.session;

import com.pasarelapago.entity.Pagos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author andre
 */
@Local
public interface PagosManagerLocal {

    List<Pagos> getAllPagos();

    Pagos update(Pagos pagos);
    
}
