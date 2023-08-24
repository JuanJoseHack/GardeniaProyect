/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.infrastructure.configuration;

import GardeniaProyect.demo.app.repository.ProductRepository;
import GardeniaProyect.demo.app.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author juanjo
 */

@Configuration
public class BeanConfiguration {
    @Bean
    
    public ProductService productService(ProductRepository productRepository){
        return new ProductService(productRepository);
    }
}
