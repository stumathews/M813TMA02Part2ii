/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import BOLO.Customer;
import BOLO.Product;
import BOLO.CustomerReview;
import BOLO.Review;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Holds test data
 */
public class TestData 
{
    public static String LIGHT_BULB = "LightBulb";
    public static String PICTURE_FRAME = "PictureFrame";
    public static String DISNEY_NAME = "Disney";
    public static String APPLE_NAME = "Apple";
    
    public static Product PictureFrame = new Product(PICTURE_FRAME, 2.50f);
    public static Product LightBulb = new Product(LIGHT_BULB, 1.25f);
     
    public static Customer Disney = new Customer(DISNEY_NAME);
    public static Customer Apple = new Customer(APPLE_NAME);
    
    public static Review loveReview = new Review("I love it!");
    public static Review hateReview = new Review("I hate it!");
    
    public static HashMap<Product, List<CustomerReview>> Reviews = new HashMap<Product, List<CustomerReview>>()
    {{
        put(PictureFrame, new ArrayList<CustomerReview>()
            {{ 
                add(new CustomerReview(Disney, PictureFrame, loveReview));
                add(new CustomerReview(Apple, PictureFrame, loveReview));
                add(new CustomerReview(Apple, LightBulb, hateReview)); 
            }});
    }};
    
    public static HashMap<Product, Integer> Stock = new HashMap<Product, Integer>(){{
        put(PictureFrame, 2);
        put(LightBulb, 4);
    }};
}
