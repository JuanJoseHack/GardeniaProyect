/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GardeniaProyect.demo.app.repository;

import GardeniaProyect.demo.infrastructure.entity.UserEntity;

/**
 *
 * @author juanjo
 */
public interface UserRepository {

    Iterable<UserEntity> getAllUsers();

    UserEntity getUserById(Integer id);

    UserEntity saveUser(UserEntity user);

    void deleteUserById(Integer id);
}
