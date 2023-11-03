/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.infrastructure.adapter;

import GardeniaProyect.demo.app.repository.StockRepository;
import GardeniaProyect.demo.infrastructure.entity.ProductEntity;
import GardeniaProyect.demo.infrastructure.entity.StockEntity;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juanj
 */
@Repository
public class StockRepositoryImpl implements StockRepository{
private final StockCrudRepository stockCrudRepository;

    public StockRepositoryImpl(StockCrudRepository stockCrudRepository) {
        this.stockCrudRepository = stockCrudRepository;
    }

    @Override
    public StockEntity saveStock(StockEntity stockEntity) {
        return stockCrudRepository.save(stockEntity);
    }

    @Override
    public List<StockEntity> getStockByProductEntity(ProductEntity productEntity) {
    return stockCrudRepository.getStockByProductEntity(productEntity);
    }

}
