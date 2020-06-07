/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.HashMap;
import tma02partaii.Customer;
import tma02partaii.Product;


/**
 *
 * @author cex
 */
public class TestData 
{
    public static String LIGHT_BULB = "LightBulb";
    public static String PICTURE_FRAME = "PictureFrame";
    public static String DISNEY_NAME = "Disney";
    
    public static Product PictureFrame = new Product(PICTURE_FRAME);
     public static Product LightBulb = new Product(LIGHT_BULB);
     
     public static Customer Disney = new Customer(DISNEY_NAME);
    
    public static HashMap<Product, Integer> Stock = new HashMap<Product, Integer>(){{
        put(PictureFrame, 2);
        put(LightBulb, 4);
    }};
}
