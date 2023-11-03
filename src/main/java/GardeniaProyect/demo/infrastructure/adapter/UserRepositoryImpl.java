/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.infrastructure.adapter;

import GardeniaProyect.demo.app.repository.UserRepository;
import GardeniaProyect.demo.infrastructure.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juanj
 */
@Repository
public class UserRepositoryImpl implements UserRepository{
    private final UserCrudRepository crudRepository;

    public UserRepositoryImpl(UserCrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    @Override
    public Iterable<UserEntity> getAllUsers() {
        return crudRepository.findAll();
    }

    @Override
    public UserEntity getUserById(Integer id) {
        return crudRepository.findById(id).get();
    }

    @Override
    public UserEntity saveUser(UserEntity user) {
        return crudRepository.save(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        crudRepository.deleteById(id);
    }
   
}
