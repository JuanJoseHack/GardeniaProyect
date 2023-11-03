/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GardeniaProyect.demo.app.service;

import GardeniaProyect.demo.app.domain.ItemCart;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author juanjo
 */
public class CartService {
    private List<ItemCart>itemCarts;
    private HashMap<Integer,ItemCart>itemCartHashMap;
    
    public CartService(){
        this.itemCartHashMap = new HashMap<>();
        this.itemCarts = new ArrayList<>();
    }
    
    //metodo que agrega un nuevo prodcuto y lo actualiza en paralelo la lista en el for
    public void addItemCart(Integer idProduct, String nameProduct, Integer quality, BigDecimal price){
        ItemCart itemCart = new ItemCart(idProduct, nameProduct, quality, price);
        itemCartHashMap.put(itemCart.getIdProduct(), itemCart);
        fillList();
    }
    
    //metodo que calcula el total del carrito
    public BigDecimal getTotalCart(){
        BigDecimal total = BigDecimal.ZERO;
        for(ItemCart itemCart : itemCarts){
            total = total.add(itemCart.getTotalPriceItem());
        }
        return total;
    }
    
    
    //metodo que elimina un producto agregado
    public void removeItemCart(Integer idProduct){
        itemCartHashMap.remove(idProduct);
        fillList();
    }
    
    //metodo que agrega en un forEach los itemCarts
    private void fillList(){ 
        itemCarts.clear();
        itemCartHashMap.forEach(
                (integer,itemCart)-> itemCarts.add(itemCart)
        );
    }
    
    //metodo que alista el carrito al procesar la orden
    public void removeAllItemCart(){
        itemCartHashMap.clear();
        itemCarts.clear();
    }
    
    //para observar el proceso del item cart en consola
    public List<ItemCart>getItemCarts(){
        return itemCarts;
    }
}
