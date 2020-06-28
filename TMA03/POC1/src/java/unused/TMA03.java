/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unused;

import Exceptions.ProductOutOfStock;
import BOLO.Review;
import BOLO.Product;
import BOLO.Customer;
import BOLO.Order;
import BSL.ReviewManager;
import BSL.SmartSystem;
import Test.TestData;
import Exceptions.ProductOutOfStock;

public class TMA03 {

    public static void main(String[] args) 
    {
        // AddProductToOrder
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
        
        // AddProductReview        
        ReviewManager reviewManager = new ReviewManager();
        Review review = new Review("This is a nice Frame with good edges");
        if(!reviewManager.IsAlreadyReviewedBy(product, customer) && (reviewManager.IsPassedBlackList(review)) )
        {
            reviewManager.reviewProduct(customer, product, review);
        }
    }    
}















