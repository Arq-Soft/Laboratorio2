/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pasarelapago.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "PAGOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pagos.findAll", query = "SELECT p FROM Pagos p")
    , @NamedQuery(name = "Pagos.findByNumerofactura", query = "SELECT p FROM Pagos p WHERE p.numerofactura = :numerofactura")
    , @NamedQuery(name = "Pagos.findByNombre", query = "SELECT p FROM Pagos p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Pagos.findByEmail", query = "SELECT p FROM Pagos p WHERE p.email = :email")
    , @NamedQuery(name = "Pagos.findByCvv", query = "SELECT p FROM Pagos p WHERE p.cvv = :cvv")
    , @NamedQuery(name = "Pagos.findByTipotarjeta", query = "SELECT p FROM Pagos p WHERE p.tipotarjeta = :tipotarjeta")
    , @NamedQuery(name = "Pagos.findByValortransaccion", query = "SELECT p FROM Pagos p WHERE p.valortransaccion = :valortransaccion")
    , @NamedQuery(name = "Pagos.findByNumerotarjeta", query = "SELECT p FROM Pagos p WHERE p.numerotarjeta = :numerotarjeta")
    , @NamedQuery(name = "Pagos.findByFechavencimientotarjeta", query = "SELECT p FROM Pagos p WHERE p.fechavencimientotarjeta = :fechavencimientotarjeta")
    , @NamedQuery(name = "Pagos.findByFechadefactura", query = "SELECT p FROM Pagos p WHERE p.fechadefactura = :fechadefactura")})
public class Pagos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMEROFACTURA")
    private Integer numerofactura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CVV")
    private int cvv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "TIPOTARJETA")
    private String tipotarjeta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALORTRANSACCION")
    private int valortransaccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "NUMEROTARJETA")
    private String numerotarjeta;
    @Column(name = "FECHAVENCIMIENTOTARJETA")
    @Temporal(TemporalType.DATE)
    private Date fechavencimientotarjeta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHADEFACTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechadefactura;

    public Pagos() {
    }

    public Pagos(Integer numerofactura) {
        this.numerofactura = numerofactura;
    }

    public Pagos(Integer numerofactura, String nombre, String email, int cvv, String tipotarjeta, int valortransaccion, String numerotarjeta, Date fechadefactura) {
        this.numerofactura = numerofactura;
        this.nombre = nombre;
        this.email = email;
        this.cvv = cvv;
        this.tipotarjeta = tipotarjeta;
        this.valortransaccion = valortransaccion;
        this.numerotarjeta = numerotarjeta;
        this.fechadefactura = fechadefactura;
    }

    public Integer getNumerofactura() {
        return numerofactura;
    }

    public void setNumerofactura(Integer numerofactura) {
        this.numerofactura = numerofactura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getTipotarjeta() {
        return tipotarjeta;
    }

    public void setTipotarjeta(String tipotarjeta) {
        this.tipotarjeta = tipotarjeta;
    }

    public int getValortransaccion() {
        return valortransaccion;
    }

    public void setValortransaccion(int valortransaccion) {
        this.valortransaccion = valortransaccion;
    }

    public String getNumerotarjeta() {
        return numerotarjeta;
    }

    public void setNumerotarjeta(String numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public Date getFechavencimientotarjeta() {
        return fechavencimientotarjeta;
    }

    public void setFechavencimientotarjeta(Date fechavencimientotarjeta) {
        this.fechavencimientotarjeta = fechavencimientotarjeta;
    }

    public Date getFechadefactura() {
        return fechadefactura;
    }

    public void setFechadefactura(Date fechadefactura) {
        this.fechadefactura = fechadefactura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numerofactura != null ? numerofactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagos)) {
            return false;
        }
        Pagos other = (Pagos) object;
        if ((this.numerofactura == null && other.numerofactura != null) || (this.numerofactura != null && !this.numerofactura.equals(other.numerofactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pasarelapago.entity.Pagos[ numerofactura=" + numerofactura + " ]";
    }
    
}
