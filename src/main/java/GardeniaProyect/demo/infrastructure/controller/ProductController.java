/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.infrastructure.controller;

import GardeniaProyect.demo.app.service.ProductService;
import GardeniaProyect.demo.infrastructure.entity.ProductEntity;
import GardeniaProyect.demo.infrastructure.entity.UserEntity;
import org.slf4j.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author juanjo
 */

@Controller
@RequestMapping("admin/products")
public class ProductController {
    private final ProductService productService;
private final Logger log = LoggerFactory.getLogger(ProductController.class);    

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    
    //crear nuevo producto
    @GetMapping("/create")
    public String create(){
        return "admin/products/create";
    }
    //guardar producto
     @PostMapping("/save-product")
    public String saveProduct(ProductEntity product) {
        log.info("Nombre de producto: {}", product);
        productService.saveProduct(product);
        return "admin/products/create";
        //return "redirect:/admin";
    }
    
    @GetMapping("/show")
    public String showProduct(Model model){
        //log.info("id user desde la variable de session: {}");
        UserEntity user = new UserEntity();
        user.setId(1);
        Iterable<ProductEntity> products = productService.getProductsByUser(user);
        model.addAttribute("products", products);
        return "admin/products/show";
    }


    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable Integer id, Model model){
        ProductEntity product = productService.getProductById(id);
        log.info("Product obtenido: {}", product);
        model.addAttribute("product",product);
        return "admin/products/edit";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){
        productService.deleteProductById(id);
        return "redirect:/admin/products/show";
    } 
}