/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.app.service;

import GardeniaProyect.demo.app.repository.StockRepository;
import GardeniaProyect.demo.infrastructure.entity.ProductEntity;
import GardeniaProyect.demo.infrastructure.entity.StockEntity;
import java.util.List;

/**
 *
 * @author juanjo
 */
public class StockService {
    private final StockRepository stockRepository;

    
   public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }
   
   public StockEntity saveStock(StockEntity stockEntity){
       return stockRepository.saveStock(stockEntity);
   }
   public List<StockEntity> getStockByProductEntity(ProductEntity productEntity){
     return stockRepository.getStockByProductEntity(productEntity);
   }
}
