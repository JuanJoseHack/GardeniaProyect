/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GardeniaProyect.demo.app.repository;

import GardeniaProyect.demo.infrastructure.entity.ProductEntity;
import GardeniaProyect.demo.infrastructure.entity.StockEntity;
import java.util.List;


/**
 *
 * @author juanj
 */
public interface StockRepository {
    StockEntity saveStock(StockEntity stockEntity);
    List<StockEntity> getStockByProductEntity(ProductEntity productEntity);
}
