/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GardeniaProyect.demo.infrastructure.adapter;

import GardeniaProyect.demo.infrastructure.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author juanj
 */
public interface UserCrudRepository extends CrudRepository<UserEntity, Integer>{
}
