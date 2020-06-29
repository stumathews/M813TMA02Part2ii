/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

import BusinessLayer.Customer;
import BusinessLayer.Order;
import BusinessLayer.Product;
import Exceptions.ProductOutOfStock;


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
    public Order AddProductToOrder(Product product, Customer customer, Order order) throws ProductOutOfStock
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