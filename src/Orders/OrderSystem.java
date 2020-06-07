/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders;

import java.util.HashMap;
import tma02partaii.Customer;
import tma02partaii.Product;
import tma02partaii.Warehouse;

public class OrderSystem 
{
    public OrderSystem()
    {        
        warehouse = new Warehouse(Test.TestData.Stock);
    }
    public void AddProductToOrder(Product product, Customer customer, Order order)
    {        
        order.AddProduct(product);
    }
    
    public Boolean IsProductStocked(Product product)
    {
        return warehouse.IsProductStocked(product);
    }
    
    public void DecreaseInventory(Product product)
    {
        warehouse.DecreaseInventory(product);
    }
    
    private Warehouse warehouse;
}