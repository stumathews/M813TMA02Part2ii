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
    
    public Order(Integer number, Customer customer)
    {
        this.customer = customer;   
        this.number = number;
    }
    
    public void AddOrderItem(Product product)
    {
        items.add(new OrderItem(product));
    }

    public void AddProduct(Product product)
    {
        AddOrderItem(product);
    }
    
    public Integer getNumber()
    {
        return number;
    }
}

