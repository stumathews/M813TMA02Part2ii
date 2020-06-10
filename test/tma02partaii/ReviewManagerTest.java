/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tma02partaii;

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

    /**
     * Test of IsAlreadyReviewedBy method, of class ReviewManager.
     */
    @Test
    public void testIsAlreadyReviewedBy() {
        System.out.println("IsAlreadyReviewedBy");
        Product product = null;
        Customer customer = null;
        ReviewManager instance = new ReviewManager();
        Boolean expResult = null;
        Boolean result = instance.IsAlreadyReviewedBy(product, customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsPassedBlackList method, of class ReviewManager.
     */
    @Test
    public void testIsPassedBlackList() {
        System.out.println("IsPassedBlackList");
        Review review = null;
        ReviewManager instance = new ReviewManager();
        Boolean expResult = null;
        Boolean result = instance.IsPassedBlackList(review);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddCustomerReview method, of class ReviewManager.
     */
    @Test
    public void testAddCustomerReview() {
        System.out.println("AddCustomerReview");
        Customer customer = null;
        Product product = null;
        Review review = null;
        ReviewManager instance = new ReviewManager();
        CustomerReview expResult = null;
        CustomerReview result = instance.AddCustomerReview(customer, product, review);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
