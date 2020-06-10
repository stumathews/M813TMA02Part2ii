/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders;

import java.util.ArrayList;
import tma02partaii.Customer;
import tma02partaii.Product;

/**
 *
 * @author cex
 */

public class Order
{
    private final Customer customer;
    private final ArrayList<OrderItem> items = new ArrayList<>();
    private final Integer number;
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

