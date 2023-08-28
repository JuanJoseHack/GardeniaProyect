/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.infrastructure.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;

/**
 *
 * @author juanjo
 */
@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private Date date;
    private UserEntity userEntity;
    private BigDecimal totalAmount;
    private String status;
    private Date deliveryDate;
    private String shippingAddress;
    private String paymentMethod;
    private BigDecimal discount;
    private BigDecimal taxes;
    private String notes;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;

    public OrderEntity() {
    }

    public OrderEntity(int id, Date date, UserEntity userEntity, BigDecimal totalAmount, String status, Date deliveryDate, String shippingAddress, String paymentMethod, BigDecimal discount, BigDecimal taxes, String notes, LocalDateTime dateCreated, LocalDateTime dateUpdated) {
        this.id = id;
        this.date = date;
        this.userEntity = userEntity;
        this.totalAmount = totalAmount;
        this.status = status;
        this.deliveryDate = deliveryDate;
        this.shippingAddress = shippingAddress;
        this.paymentMethod = paymentMethod;
        this.discount = discount;
        this.taxes = taxes;
        this.notes = notes;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
        return "OrderEntity{" + "id=" + id + ", date=" + date + ", userEntity=" + userEntity + ", totalAmount=" + totalAmount + ", status=" + status + ", deliveryDate=" + deliveryDate + ", shippingAddress=" + shippingAddress + ", paymentMethod=" + paymentMethod + ", discount=" + discount + ", taxes=" + taxes + ", notes=" + notes + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }
    
}
