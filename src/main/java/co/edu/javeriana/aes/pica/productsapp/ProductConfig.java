/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.javeriana.aes.pica.productsapp;

import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author sebastianpacheco
 */
@Configuration
public class ProductConfig {
    
    @Bean
    @ConfigurationProperties("products.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
    
}
