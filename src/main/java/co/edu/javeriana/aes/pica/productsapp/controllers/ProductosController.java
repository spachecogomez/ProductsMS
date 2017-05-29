/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.aes.pica.productsapp.controllers;

import co.edu.javeriana.aes.pica.productsapp.entities.Product;
import co.edu.javeriana.aes.pica.productsapp.model.QueryResponse;
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

//    @RequestMapping(method = RequestMethod.GET, path = "/products/mainPage")
//    public List<Product> getProductsStart(@RequestParam int start,@RequestParam int pageSize) {
//        log.debug(String.format("Searching producto by product in page %d ", start));
//        return productRepository.findAll(new PageRequest(start, pageSize)).getContent();
//    }
    @RequestMapping(method = RequestMethod.GET, path = "/products/byespectaclename")
    public QueryResponse getProdyctsByEspectaculoName(@RequestParam(required = false) String nombre, @RequestParam int start, @RequestParam int pageSize) {
        QueryResponse response = new QueryResponse();
        if (nombre != null && nombre.trim().length() > 0) {
            String nombreQuery = "%".concat(nombre.toUpperCase()).concat("%");
            log.debug(String.format("Searching producto by espectaculo nombre with param %s ", nombreQuery));
            response.setSize(productRepository.countByCriteria(nombreQuery));
            response.setResults(productRepository.queryEspectaculos(nombreQuery, new PageRequest(start, pageSize)));
        } else {
            response.setSize(productRepository.count());
            response.setResults(productRepository.findAll(new PageRequest(start, pageSize)).getContent());
        }
        return response;
    }

}
