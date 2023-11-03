/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.app.service;

import GardeniaProyect.demo.app.repository.UserRepository;
import GardeniaProyect.demo.infrastructure.entity.UserEntity;

/**
 *
 * @author juanjo
 */
public class UserService {

    private final UserRepository userEntity;

    public UserService(UserRepository userEntity) {
        this.userEntity = userEntity;
    }

    
    public Iterable<UserEntity> getAllUsers() {
        return userEntity.getAllUsers();
    }
    
    public UserEntity getUserById(Integer id) {
        return userEntity.getUserById(id);
    }

    public UserEntity saveUser(UserEntity user) {
        return userEntity.saveUser(user);
    }

    public void deleteUserById(Integer id) {
        userEntity.deleteUserById(id);
    }
}
