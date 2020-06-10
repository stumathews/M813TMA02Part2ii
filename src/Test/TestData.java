/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tma02partaii.Customer;
import tma02partaii.CustomerReview;
import tma02partaii.Product;
import tma02partaii.Review;


/**
 *
 * @author cex
 */
public class TestData 
{
    public static String LIGHT_BULB = "LightBulb";
    public static String PICTURE_FRAME = "PictureFrame";
    public static String DISNEY_NAME = "Disney";
    public static String APPLE_NAME = "Apple";
    
    public static Product PictureFrame = new Product(PICTURE_FRAME);
    public static Product LightBulb = new Product(LIGHT_BULB);
     
    public static Customer Disney = new Customer(DISNEY_NAME);
    public static Customer Apple = new Customer(APPLE_NAME);
    
    public static Review review1 = new Review("I like it!");
    public static Review review2 = new Review("I hate it!");
    
    public static HashMap<Product, List<CustomerReview>> Reviews = new HashMap<Product, List<CustomerReview>>()
    {{
        put(PictureFrame, new ArrayList<CustomerReview>()
            {{ 
                add(new CustomerReview(Disney, PictureFrame, review1));
                add(new CustomerReview(Apple, PictureFrame, review1));
                add(new CustomerReview(Apple, LightBulb, review2)); 
            }});
    }};
    
    public static HashMap<Product, Integer> Stock = new HashMap<Product, Integer>(){{
        put(PictureFrame, 2);
        put(LightBulb, 4);
    }};
}
