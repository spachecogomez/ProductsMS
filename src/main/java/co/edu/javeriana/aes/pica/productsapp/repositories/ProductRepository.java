/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.aes.pica.productsapp.repositories;

import co.edu.javeriana.aes.pica.productsapp.entities.Product;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author sebastianpacheco
 */
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer>{
    
    @Query("SELECT p FROM Product p INNER JOIN p.espectaculo e INNER JOIN p.estadia est WHERE UPPER(e.nombre) LIKE :nombre ")
    List<Product> queryEspectaculos(@Param("nombre")String nombreQuery,Pageable page);
    
    @Query("SELECT count(p) FROM Product p INNER JOIN p.espectaculo e INNER JOIN p.estadia est WHERE UPPER(e.nombre) LIKE :nombre ")
    Long countByCriteria(@Param("nombre")String nombreQuery);
    
}
