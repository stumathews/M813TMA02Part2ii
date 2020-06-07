/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tma02partaii;

import Orders.Order;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author cex
 */

public class Customer 
{
    private final String name;
    private Map<Integer, Order> orders = new HashMap<Integer, Order>();
    
    public Customer(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }

    public void AddOrder(Order order) 
    {
        orders.put(order.getNumber(), order);
    }
    
    
}