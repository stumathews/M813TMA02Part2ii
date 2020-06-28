/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tma02partaii;

import Orders.OrderSystem;
import Orders.Order;
import tma02partaii.Customer;
import tma02partaii.Product;

/**
 *
 * @author cex
 */
public class SmartSystem
{
    private final OrderSystem orderSystem;
            
    public SmartSystem()
    {
        // Ready the stock 
        orderSystem = new OrderSystem();
    }
            
    /**
     * Validates that product can be added to order and does so
     * @param product
     * @param customer
     * @param order
     * @return
     * @throws ProductOutOfStock 
     */
    public Orders.Order AddProductToOrder(Product product, Customer customer, Orders.Order order) throws ProductOutOfStock
    {        
        if(!orderSystem.IsProductStocked(product))
        {
            throw new ProductOutOfStock(product); 
        } 
        
        orderSystem.AddProductToOrder(product, customer, order);
        orderSystem.DecreaseInventory(product);
        
       return order;
    }    
}