/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.infrastructure.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author juanjo
 */
@Entity
@Table(name = "orderdetails")
public class OrderDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private OrderEntity orderEntity;
    private ProductEntity productEntity;
    private int quantity;
    private BigDecimal unitPrice;
    private BigDecimal subtotal;
    private BigDecimal individualDiscount;
    private BigDecimal individualTaxes;
    private BigDecimal subtotalWithDiscount;
    private BigDecimal subtotalWithTaxes;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;

    public OrderDetailEntity() {
    }

    public OrderDetailEntity(int id, OrderEntity orderEntity, ProductEntity productEntity, int quantity, BigDecimal unitPrice, BigDecimal subtotal, BigDecimal individualDiscount, BigDecimal individualTaxes, BigDecimal subtotalWithDiscount, BigDecimal subtotalWithTaxes, LocalDateTime dateCreated, LocalDateTime dateUpdated) {
        this.id = id;
        this.orderEntity = orderEntity;
        this.productEntity = productEntity;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subtotal = subtotal;
        this.individualDiscount = individualDiscount;
        this.individualTaxes = individualTaxes;
        this.subtotalWithDiscount = subtotalWithDiscount;
        this.subtotalWithTaxes = subtotalWithTaxes;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getIndividualDiscount() {
        return individualDiscount;
    }

    public void setIndividualDiscount(BigDecimal individualDiscount) {
        this.individualDiscount = individualDiscount;
    }

    public BigDecimal getIndividualTaxes() {
        return individualTaxes;
    }

    public void setIndividualTaxes(BigDecimal individualTaxes) {
        this.individualTaxes = individualTaxes;
    }

    public BigDecimal getSubtotalWithDiscount() {
        return subtotalWithDiscount;
    }

    public void setSubtotalWithDiscount(BigDecimal subtotalWithDiscount) {
        this.subtotalWithDiscount = subtotalWithDiscount;
    }

    public BigDecimal getSubtotalWithTaxes() {
        return subtotalWithTaxes;
    }

    public void setSubtotalWithTaxes(BigDecimal subtotalWithTaxes) {
        this.subtotalWithTaxes = subtotalWithTaxes;
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
        return "OrderDetailEntity{" + "id=" + id + ", orderEntity=" + orderEntity + ", productEntity=" + productEntity + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", subtotal=" + subtotal + ", individualDiscount=" + individualDiscount + ", individualTaxes=" + individualTaxes + ", subtotalWithDiscount=" + subtotalWithDiscount + ", subtotalWithTaxes=" + subtotalWithTaxes + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated + '}';
    }

}
