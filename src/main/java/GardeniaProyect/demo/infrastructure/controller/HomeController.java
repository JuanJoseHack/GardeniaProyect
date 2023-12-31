/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.infrastructure.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import GardeniaProyect.demo.app.service.ProductService;
import GardeniaProyect.demo.app.service.StockService;
import GardeniaProyect.demo.infrastructure.entity.StockEntity;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author juanj
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    private final ProductService productService;
    private final StockService stockService;
    private final Logger log = LoggerFactory.getLogger(ProductController.class);    

    public HomeController(ProductService productService, StockService stockService) {
        this.productService = productService;
        this.stockService = stockService;
    }

    
    
    @GetMapping
    public String home(Model model){
    model.addAttribute("products", productService.getProducts());
        return "home";
    }
    
    @GetMapping("/product-detail/{id}")
    public String productDetail(@PathVariable Integer id, Model model){
        List<StockEntity> stocks = stockService.getStockByProductEntity(productService.getProductById(id));
        log.info("Id product: {}", id);
        log.info("stock size: {}", stocks.size());
        log.info("stock : {}", stocks);
        Integer lastBalance = stocks.get(stocks.size()-1).getBalance();

        model.addAttribute("product", productService.getProductById(id));
        model.addAttribute("stock", lastBalance);
        try {
            model.addAttribute("id", 1);
        }catch (Exception e){

        }
        return "user/productdetail";
    }
    
}
