/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.infrastructure.entity;

import jakarta.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

/**
 *
 * @author juanjo
 */
@Entity
@Table(name = "stocks")
public class StockEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private ProductEntity productEntity;
    private int availableQuantity;
    private String location;
    private Date lastUpdateDate;
    private int minimumQuantity;
    private int maximumQuantity;
    private String supplier;
    private Date lastEntryDate;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;

    public StockEntity() {
    }

    public StockEntity(int id, ProductEntity productEntity, int availableQuantity, String location, Date lastUpdateDate, int minimumQuantity, int maximumQuantity, String supplier, Date lastEntryDate, LocalDateTime dateCreated, LocalDateTime dateUpdated) {
        this.id = id;
        this.productEntity = productEntity;
        this.availableQuantity = availableQuantity;
        this.location = location;
        this.lastUpdateDate = lastUpdateDate;
        this.minimumQuantity = minimumQuantity;
        this.maximumQuantity = maximumQuantity;
        this.supplier = supplier;
        this.lastEntryDate = lastEntryDate;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    public void setMinimumQuantity(int minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(int maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Date getLastEntryDate() {
        return lastEntryDate;
    }

    public void setLastEntryDate(Date lastEntryDate) {
        this.lastEntryDate = lastEntryDate;
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
        return "StockEntity{" + "id=" + id + ", productEntity=" + productEntity + ", availableQuantity=" + availableQuantity + ", location=" + location + ", lastUpdateDate=" + lastUpdateDate + ", minimumQuantity=" + minimumQuantity + ", maximumQuantity=" + maximumQuantity + ", supplier=" + supplier + ", lastEntryDate=" + lastEntryDate + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }
    
}
