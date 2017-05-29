/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.aes.pica.productsapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author sebastianpacheco
 */
@Entity
@Table(name = "Producto",schema = "Sales")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {
    
    @Id
    @Column(name = "prod_id")
    private Integer prodID;
    
    @Column(name = "fecha_espectaculo")
    private Date fechaEspectaculo;
    
    @Column(name = "fecha_llegada")
    private String fechaLlegada;
    
    @Column(name = "fecha_salida")
    private String fechaSalida;
    
    @Column(name = "ciudad_espectaculo")
    private String ciudad;
    
    @ManyToOne(fetch = FetchType.EAGER ,targetEntity = Espectaculo.class)
    @JoinColumn(name = "espectaculo", referencedColumnName = "id_tespectaculo")
    private Espectaculo espectaculo;
    
    @ManyToOne(fetch = FetchType.LAZY ,targetEntity = Estadia.class)
    @JoinColumn(name = "estadia", referencedColumnName = "id_testadia")
    private Estadia estadia;
    
    @ManyToOne(fetch = FetchType.EAGER ,targetEntity = Transporte.class)
    @JoinColumn(name = "transporte", referencedColumnName = "id_ttransporte")
    private Transporte transporte;

    public Integer getProdID() {
        return prodID;
    }

    public void setProdID(Integer prodID) {
        this.prodID = prodID;
    }

    public Date getFechaEspectaculo() {
        return fechaEspectaculo;
    }

    public void setFechaEspectaculo(Date fechaEspectaculo) {
        this.fechaEspectaculo = fechaEspectaculo;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * @return the espectaculo
     */
    public Espectaculo getEspectaculo() {
        return espectaculo;
    }

    /**
     * @param espectaculo the espectaculo to set
     */
    public void setEspectaculo(Espectaculo espectaculo) {
        this.espectaculo = espectaculo;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the estadia
     */
    public Estadia getEstadia() {
        return estadia;
    }

    /**
     * @param estadia the estadia to set
     */
    public void setEstadia(Estadia estadia) {
        this.estadia = estadia;
    }

    /**
     * @return the transporte
     */
    public Transporte getTransporte() {
        return transporte;
    }

    /**
     * @param transporte the transporte to set
     */
    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
    
}
