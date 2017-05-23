/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.aes.pica.productsapp.controllers;

import co.edu.javeriana.aes.pica.productsapp.entities.Product;
import co.edu.javeriana.aes.pica.productsapp.repositories.ProductRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sebastianpacheco
 */
@RestController
public class ProductosController {

    private Logger log = LoggerFactory.getLogger(ProductosController.class);

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/products")
    public Product getProductsByCode(@RequestParam int productCode) {
        log.debug(String.format("Searching producto by product code with param %d ", productCode));
        return productRepository.findOne(productCode);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/products/byespectaclename")
    public List<Product> getProdyctsByEspectaculoName(@RequestParam String nombre, @RequestParam int start,@RequestParam int pageSize) {
        String nombreQuery = "%".concat(nombre.toUpperCase()).concat("%");
        log.debug(String.format("Searching producto by espectaculo nombre with param %s ", nombreQuery));
        return productRepository.queryEspectaculos(nombreQuery, new PageRequest(start, pageSize));
    }

}
