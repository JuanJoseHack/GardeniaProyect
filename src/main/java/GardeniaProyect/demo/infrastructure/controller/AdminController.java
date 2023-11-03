/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.infrastructure.controller;

import GardeniaProyect.demo.app.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author juanj
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
   private final ProductService productService;

    public AdminController(ProductService productService) {
        this.productService = productService;
    }
   
   @GetMapping
   public String admin(Model model){
       model.addAttribute("products",productService.getProducts());
       return "admin/home_admin";
   }
}
