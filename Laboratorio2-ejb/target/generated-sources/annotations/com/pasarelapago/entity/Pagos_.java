package com.pasarelapago.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-05T11:11:23")
@StaticMetamodel(Pagos.class)
public class Pagos_ { 

    public static volatile SingularAttribute<Pagos, Integer> numerofactura;
    public static volatile SingularAttribute<Pagos, Integer> cvv;
    public static volatile SingularAttribute<Pagos, String> numerotarjeta;
    public static volatile SingularAttribute<Pagos, Date> fechavencimiento;
    public static volatile SingularAttribute<Pagos, String> nombre;
    public static volatile SingularAttribute<Pagos, String> tipotarjeta;
    public static volatile SingularAttribute<Pagos, String> email;
    public static volatile SingularAttribute<Pagos, Integer> valortransaccion;

}