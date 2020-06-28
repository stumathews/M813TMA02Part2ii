/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSL;

import BOLO.Review;
import BOLO.CustomerReview;
import BOLO.Product;
import BOLO.Customer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Responsible for tracking reviews
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
    
    /**
     * Checks to see if this product already has a review by this customer
     * @param product to check for a review for
     * @param customer to check that a review exists for the product or not
     * @return 
     */
    public Boolean IsAlreadyReviewedBy(Product product, Customer customer)
    { 
        return !reviews.containsKey(product) 
                ? false 
                : reviews.get(product).stream().anyMatch((review) -> (review.getCustomer().equals(customer)));
    }
    
    /**
     * ASk the blackList review if this review is suitable
     * @param review under inspection
     * @return true if suitable, false otherwise
     */
    public Boolean IsPassedBlackList(Review review)
    {
        return blackListService.IsReviewSuitable(review);
    }
    
    /**
     * Adds the review for a product
     * @param customer performing the review
     * @param product being reviewed
     * @param review for the product by the customer
     * @return 
     */
    public CustomerReview reviewProduct(Customer customer, Product product, Review review)
    {
        CustomerReview customerReview = new CustomerReview(customer, product, review);
        List<CustomerReview> productReviews;
        ArrayList<CustomerReview> customerReviews = new ArrayList<>();
        
        // Add to existing reviews for product or make place for new review
        if(reviews.containsKey(product))
        {
            productReviews = reviews.get(product);
            productReviews.add(customerReview);
        }
        else
        {           
            customerReviews.add(customerReview);
            reviews.put(product, customerReviews);
        }
        return customerReview;
    }
}
