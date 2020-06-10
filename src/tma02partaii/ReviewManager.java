/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tma02partaii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author cex
 */
public class ReviewManager 
{
    BlackListSystem blackListService;
    HashMap<Product, List<CustomerReview>> reviews;
    
    public ReviewManager()
    {
        blackListService = new BlackListSystem();
        reviews = Test.TestData.Reviews;
    }
    
    public Boolean IsAlreadyReviewedBy(Product product, Customer customer)
    { 
        return !reviews.containsKey(product) 
                ? false 
                : reviews.get(product).stream().anyMatch((review) -> (review.getCustomer().equals(customer)));
    }
    
    public Boolean IsPassedBlackList(Review review)
    {
        return blackListService.IsReviewSuitable(review);
    }
    
    public CustomerReview AddCustomerReview(Customer customer, Product product, Review review)
    {
        CustomerReview customerReview = new CustomerReview(customer, product, review);
        if(reviews.containsKey(product))
        {
            reviews.get(product).add(customerReview);
        }
        else
        {
            ArrayList<CustomerReview> customerReviews = new ArrayList<>();
            customerReviews.add(customerReview);
            reviews.put(product, customerReviews);
        }
        return customerReview;
    }
}
