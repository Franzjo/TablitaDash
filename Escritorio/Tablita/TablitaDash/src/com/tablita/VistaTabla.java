package com.tablita;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.io.Serializable;
import java.util.List;

/**
 * Creado por akino on 12-15-15.
 */
@ManagedBean(name ="dtVistaTabla")
public class VistaTabla implements Serializable{
    private List<Ventas> ventasDiarias;
    private List<Ventas> ventasMensuales;
    private List<Ventas> ventasAnules;

    @ManagedProperty("#{utils}")
    private Utils utils;

    @PostConstruct
    public void init(){
        ventasDiarias = utils.getVentasDiarias();
    }

    public List<Ventas> getVentasDiarias() {
        return ventasDiarias;
    }

    public void setUtils(Utils utils) {
        this.utils = utils;
    }


}
