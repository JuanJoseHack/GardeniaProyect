/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GardeniaProyect.demo.infrastructure.adapter;

import GardeniaProyect.demo.infrastructure.entity.ProductEntity;
import GardeniaProyect.demo.infrastructure.entity.StockEntity;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author juanj
 */
public interface StockCrudRepository extends CrudRepository<StockEntity, Integer>{
       List<StockEntity> getStockByProductEntity(ProductEntity productEntity);  
 
}
