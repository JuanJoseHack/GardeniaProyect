/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GardeniaProyect.demo.app.repository;

import GardeniaProyect.demo.infrastructure.entity.ProductEntity;
import GardeniaProyect.demo.infrastructure.entity.UserEntity;
import org.springframework.stereotype.Repository;
/**
 *
 * @author juanjo
 */ 
public interface ProductRepository {
    //lista de todos los productos
    Iterable<ProductEntity>getProducts();
    //lista de productos por usuario 
    Iterable<ProductEntity>getProductsByUser(UserEntity user);
    //busca el producto por id
    ProductEntity getProductById(Integer id);
    //guarda el producto por id
    ProductEntity saveProduct(ProductEntity product);
    //elimina los productos por id 
    void deleteProductById(Integer id);
}
