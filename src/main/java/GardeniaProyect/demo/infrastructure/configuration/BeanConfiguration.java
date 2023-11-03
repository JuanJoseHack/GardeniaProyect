/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.infrastructure.configuration;

import GardeniaProyect.demo.app.repository.ProductRepository;
import GardeniaProyect.demo.app.repository.StockRepository;
import GardeniaProyect.demo.app.repository.UserRepository;
import GardeniaProyect.demo.app.service.ProductService;
import GardeniaProyect.demo.app.service.StockService;
import GardeniaProyect.demo.app.service.UploadFile;
import GardeniaProyect.demo.app.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author juanjo
 */

@Configuration
public class BeanConfiguration {
    @Bean
    public ProductService productService(ProductRepository productRepository, UploadFile uploadFile){
        return new ProductService(productRepository, uploadFile);
    }
    
   
    @Bean
    public UserService userService(UserRepository userRepository){
        return new UserService(userRepository);
    }
    
    @Bean
    public UploadFile uploadFile(){
        return new UploadFile();
    }
    
    @Bean
   public StockService stockService(StockRepository stockRepository){
      return new StockService(stockRepository);
   }
}
