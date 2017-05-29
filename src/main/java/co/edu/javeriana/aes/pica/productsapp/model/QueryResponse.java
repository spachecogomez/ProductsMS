/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.aes.pica.productsapp.model;

import co.edu.javeriana.aes.pica.productsapp.entities.Product;
import java.util.List;

/**
 *
 * @author sebastianpacheco
 */
public class QueryResponse {
    
    private long size;
    
    private List<Product> results;

    /**
     * @return the size
     */
    public long getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(long size) {
        this.size = size;
    }

    /**
     * @return the results
     */
    public List<Product> getResults() {
        return results;
    }

    /**
     * @param results the results to set
     */
    public void setResults(List<Product> results) {
        this.results = results;
    }
    
    
    
}
