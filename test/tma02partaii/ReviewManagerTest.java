/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tma02partaii;

import Test.TestData;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cex
 */
public class ReviewManagerTest {
    
    public ReviewManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    @Test
    public void testAddCustomerReview() {
       ReviewManager reviewManager = new ReviewManager();
       Review review = new Review("I personally love it");
       Customer customer = new Customer("HomeDepot");
       Product product = new Product("Mouse", 1.65f);
       
       int numReviewsBefore = reviewManager.reviews.size();
       
       reviewManager.AddCustomerReview(customer, product, review);

       // number of reviews has increased       
       assert( reviewManager.reviews.size() > numReviewsBefore);
       
       // contains a review for the product
       assert(reviewManager.reviews.containsKey(product));
       
       // Contains the specific review
       assert(reviewManager.reviews.get(product).stream().anyMatch((customerReview) -> (customerReview.getReview() == review)));
       
       // Ensure all assocations are created between product, customer, review on CustomerReview object
       assert(reviewManager.reviews.get(product).stream().anyMatch((customerReview) -> (
                       customerReview.getReview().equals(review) && 
                       customerReview.getCustomer().equals(customer) &&
                       customerReview.getProduct().equals(product))));
       
    }
    
}

