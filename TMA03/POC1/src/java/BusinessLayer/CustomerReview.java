/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

import BusinessLayer.Product;
import BusinessLayer.Customer;

/**
 *
 * @author cex
 */
public class CustomerReview 
{
    private final Customer customer;
    private final Product product;
    private final Review review;
    
    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public Review getReview() {
        return review;
    }   
    
    public CustomerReview(Customer customer, Product product, Review review) 
    {
        this.customer = customer;
        this.product = product;
        this.review = review;
    }    
}
