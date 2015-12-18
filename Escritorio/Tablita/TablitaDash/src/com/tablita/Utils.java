package com.tablita;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.IOException;
import java.util.List;

/**
 * Creado por akino on 12-15-15.
 */
@ManagedBean(name = "utils")
@ApplicationScoped
public class Utils {
    private List<Ventas> ventasDiarias;
    private List<Ventas> ventasSemanales;
    private List<Ventas> ventasMensuales;
    ObjectMapper mapper = new ObjectMapper();

    public List<Ventas> getVentasSemanales() {
        return ventasSemanales;
    }

    public void setVentasSemanales(List<Ventas> ventasSemanales) {
        this.ventasSemanales = ventasSemanales;
    }

    public List<Ventas> getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(List<Ventas> ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    Ventas getVenta(String json) throws IOException {
        return new ObjectMapper().readValue(json, Ventas.class);
    }

    private void parseVentasDiarias(String json) throws IOException {
        ventasDiarias = mapper.readValue(json,
                TypeFactory.defaultInstance().constructCollectionType(List.class,
                        Ventas.class));
    }

    private void parseVentasSemanales(String json) throws IOException {
        ventasDiarias = mapper.readValue(json,
                TypeFactory.defaultInstance().constructCollectionType(List.class,
                        Ventas.class));
    }

    private void parseVentasMensuales(String json) throws IOException {
        ventasDiarias = mapper.readValue(json,
                TypeFactory.defaultInstance().constructCollectionType(List.class,
                        Ventas.class));
    }

    public List<Ventas> getVentasDiarias() {
        if(ventasDiarias != null){
            return ventasDiarias;
        }
        return null;
    }
}
