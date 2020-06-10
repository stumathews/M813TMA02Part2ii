/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orders;

import Test.TestData;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tma02partaii.Product;

/**
 *
 * @author cex
 */
public class OrderTest {
    
    public OrderTest() {
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
     * Test of AddProductToOrder method, of class Order.
     */
    @Test
    public void testAddProductToOrderIncreasesOrderItems() 
    {
        Order order = new Order(1, TestData.Apple);
        int beforeCost = order.GetOrderItems().size();        
            order.AddProductToOrder(TestData.PictureFrame);        
        int afterCost = order.GetOrderItems().size();
        
        assert(afterCost > beforeCost);
        assert(afterCost == beforeCost+1);       
        
    }
    
    @Test
    public void testAddProductToOrderAndOrderAmountIncreases()
    {
        Product product = TestData.PictureFrame;
        Order order = new Order(1, TestData.Apple);
        float beforeAmount = order.getAmount();
        order.AddProductToOrder(product);
        
        assert( beforeAmount < order.getAmount());
        assert( order.getAmount() == beforeAmount + product.getCost() );
    }
    
    @Test public void testProductAssociatedWithOrder()
    {
        Product product = TestData.PictureFrame;
        Order order = new Order(1, TestData.Apple);
        order.AddProductToOrder(product);
        
        assert(order.GetOrderItems().stream().anyMatch((orderItem) -> (orderItem.product.equals(product))));
    }
    
}
