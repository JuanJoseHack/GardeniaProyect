    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.app.service;

import GardeniaProyect.demo.app.repository.ProductRepository;
import GardeniaProyect.demo.infrastructure.entity.ProductEntity;
import GardeniaProyect.demo.infrastructure.entity.UserEntity;
import java.io.IOException;
import java.time.LocalDateTime;
import org.slf4j.*;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author juanjo
 */

public class ProductService{
    private final ProductRepository productRepository;
    private final UploadFile uploadFile;
    private final Logger log = LoggerFactory.getLogger(ProductService.class);
    

    public ProductService(ProductRepository productRepository, UploadFile uploadFile) {
        this.productRepository = productRepository;
        this.uploadFile = uploadFile;
    }
    
    public Iterable<ProductEntity>getProducts(){
        return productRepository.getProducts();
    }
    public Iterable<ProductEntity>getProductsByUser(UserEntity user){
        return productRepository.getProductsByUser(user);
    }
    public ProductEntity getProductById(Integer id){
        return productRepository.getProductById(id);
    }
    public ProductEntity saveProduct(ProductEntity product, MultipartFile multipartFile) throws IOException{
        if (product.getId()==null) {
            UserEntity userEntity = new UserEntity();
            userEntity.setId(1);
            product.setDateCreated(LocalDateTime.now());
            product.setDateUpdated(LocalDateTime.now());
            product.setUserEntity(userEntity);
            product.setImage(uploadFile.upload(multipartFile));
            return productRepository.saveProduct(product);
        }else{
            ProductEntity productDB = productRepository.getProductById(product.getId());
            log.info("product {}", productDB);
            
            //actualizar la imagen del producto
            if (multipartFile.isEmpty()) {
                product.setImage(productDB.getImage());
            }else{
                if (!productDB.getImage().equals("default.jpg")) {
                    uploadFile.delete(productDB.getImage());
                }
                product.setImage(uploadFile.upload(multipartFile));
            }
            
            product.setCode(productDB.getCode());
            product.setUserEntity(productDB.getUserEntity());
            product.setDateCreated(productDB.getDateCreated());
            product.setDateUpdated(LocalDateTime.now());
            return productRepository.saveProduct(product);
        }   
    }
    public void deleteProductById(Integer id){
        ProductEntity p = new ProductEntity();
        p = productRepository.getProductById(id);
        
        if (!p.getImage().equals("default.jpg")) {
            uploadFile.delete(p.getImage());
        }
        productRepository.deleteProductById(id);
    }
    
    public ProductEntity saveProductApi(ProductEntity product) throws IOException {
        if (product.getId() == null) {
            UserEntity user = new UserEntity();
            user.setId(1);
            product.setDateCreated(LocalDateTime.now());
            product.setDateUpdated(LocalDateTime.now());
            product.setUserEntity(user);
            return productRepository.saveProduct(product);
        } else {
            ProductEntity productDB = productRepository.getProductById(product.getId());
            log.info("product: {}", productDB);
            //sino se carga la imagen toma la que se le guardo al registro

            product.setCode(productDB.getCode());
            product.setUserEntity(productDB.getUserEntity());
            product.setDateCreated(productDB.getDateCreated());
            product.setDateUpdated(LocalDateTime.now());
            return productRepository.saveProduct(product);
        }

    }
    
    
}
