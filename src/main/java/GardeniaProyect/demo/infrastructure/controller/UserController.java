/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.infrastructure.controller;

import GardeniaProyect.demo.app.service.UserService;
import GardeniaProyect.demo.infrastructure.entity.UserEntity;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author juanjo
 */
@Controller
@RequestMapping("admin/users")
public class UserController {
    private final UserService userService;
    private final Logger log = LoggerFactory.getLogger(UserController.class);    

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    //crear nuevo producto
    @GetMapping("/create")
    public String create(){
        return "admin/users/create";
    }
    //guardar producto
     @PostMapping("/save-user")
    public String saveUser(UserEntity user) throws IOException {
        log.info("Nombre de user: {}", user);
        userService.saveUser(user);
        return "admin/users/create";
        //return "redirect:/admin";
    }
    
   

    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable Integer id, Model model){
        UserEntity user = userService.getUserById(id);
        log.info("user obtenido: {}", user);
        model.addAttribute("user",user);
        return "admin/products/edit";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Integer id){
        userService.deleteUserById(id);
        return "redirect:/admin/users/show";
    }
}
