/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.infrastructure.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 *
 * @author juanjo
 */
@Entity
@Table(name = "categories")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String description;
    private String image;
    private String relatedProducts;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;

    public CategoryEntity() {
    }

    public CategoryEntity(int id, String name, String description, String image, String relatedProducts, LocalDateTime dateCreated, LocalDateTime dateUpdated) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.relatedProducts = relatedProducts;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(String relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" + "id=" + id + ", name=" + name + ", description=" + description + ", image=" + image + ", relatedProducts=" + relatedProducts + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }
    
}
