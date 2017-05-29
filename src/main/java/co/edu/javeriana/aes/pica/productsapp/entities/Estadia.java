/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.aes.pica.productsapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author sebastianpacheco
 */
@Entity
@Table(name = "Tarifa_Estadia",schema = "Sales")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Estadia {
    
    @Id
    @Column(name = "id_testadia")
    private Integer idEstadia;
    
    @Column
    private String descripcion;
    
    @Column
    private BigDecimal precio;
    
    @Column
    private Integer estado;
    
    @Column(name = "Fecha_Creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    
    @Column(name = "Fecha_Modificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;
    
    @JsonIgnore
    @OneToMany(mappedBy = "estadia")
    private List<Product> productos;

    public Integer getIdEstadia() {
        return idEstadia;
    }

    public void setIdEstadia(Integer idEstadia) {
        this.idEstadia = idEstadia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    /**
     * @return the productosAsociados
     */
    public List<Product> getProductos() {
        return productos;
    }

    /**
     * @param productosAsociados the productos to set
     */
    public void setProductos(List<Product> productos) {
        this.productos = productos;
    }
    
    
    
    
}
