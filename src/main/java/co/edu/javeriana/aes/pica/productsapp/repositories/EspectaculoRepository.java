/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.aes.pica.productsapp.repositories;

import co.edu.javeriana.aes.pica.productsapp.entities.Espectaculo;
import java.io.Serializable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author sebastianpacheco
 */
public interface EspectaculoRepository extends PagingAndSortingRepository<Espectaculo, Integer>{
    
}
