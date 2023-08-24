/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GardeniaProyect.demo.infrastructure.adapter;

import GardeniaProyect.demo.infrastructure.entity.ProductEntity;
import GardeniaProyect.demo.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author juanjo
 */
public interface ProductCrudRepository extends CrudRepository<ProductEntity, Integer>{
    Iterable<ProductEntity>findByUserEntity(UserEntity userEntity);
}
