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
@Table(name = "Tarifa_Transporte",schema = "Sales")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Transporte {
    
    @Id
    @Column(name = "id_ttransporte")
    private Integer idTransporte;
    
    @Column(name = "nombre_tipo")
    private String nombre;
    
    @Column(name = "precio")
    private BigDecimal precio;
    
    @Column(name = "estado")
    private Integer estado;
    
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    
    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;
    
    @OneToMany(mappedBy = "transporte")
    @JsonIgnore
    private List<Product> productosAsociados;

    /**
     * @return the idTransporte
     */
    public Integer getIdTransporte() {
        return idTransporte;
    }

    /**
     * @param idTransporte the idTransporte to set
     */
    public void setIdTransporte(Integer idTransporte) {
        this.idTransporte = idTransporte;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public BigDecimal getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    /**
     * @return the estado
     */
    public Integer getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    /**
     * @return the fechaCreacion
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * @return the fechaModificacion
     */
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * @param fechaModificacion the fechaModificacion to set
     */
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

//    /**
//     * @return the productosAsociados
//     */
//    public List<Product> getProductosAsociados() {
//        return productosAsociados;
//    }
//
//    /**
//     * @param productosAsociados the productosAsociados to set
//     */
//    public void setProductosAsociados(List<Product> productosAsociados) {
//        this.productosAsociados = productosAsociados;
//    }
//    
    
    
}
