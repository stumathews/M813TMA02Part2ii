/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tma02partaii;

import Orders.Order;
import Orders.OrderSystem;
import Test.TestData;

public class TMA02PartAii {

    public static void main(String[] args) 
    {
        Product product = TestData.PictureFrame;      
        Customer customer = TestData.Disney;     
        int orderNumber = 1;
        Order customerOrder = new Order(orderNumber, customer);   
        
        SmartSystem system = new SmartSystem();                
        
        try
        {
            system.AddProductToOrder(product, customer, customerOrder);
        }
        catch(ProductOutOfStock outOfStockException)
        {
            System.out.println(outOfStockException.getMessage());
        }        
    }    
}















