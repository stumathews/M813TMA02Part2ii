/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BOLO;

import java.util.ArrayList;

/**
 * Represents an order for a Customer
 * Order may contain many order items (line items) presenting products on order
 * @author cex
 */
public class Order
{
    private final Customer customer;
    
    // Order items
    private final ArrayList<OrderItem> items = new ArrayList<>();
    
    // orders have unique numbers
    private final Integer number;
    
    //order has a running cost of all order items
    private float amount;
    
    public Order(Integer number, Customer customer)
    {
        this.customer = customer;   
        this.number = number;
    }
    
    private void AddOrderItem(Product product)
    {
        items.add(new OrderItem(product));
    }

    public void AddProductToOrder(Product product)
    {
        AddOrderItem(product);
        amount += product.getCost();
    }
    
    public Integer getNumber()
    {
        return number;
    }
    
    public ArrayList<OrderItem> GetOrderItems()
    {
        return items;
    }
    
    public float getAmount()
    {
        return amount;
    }
}

