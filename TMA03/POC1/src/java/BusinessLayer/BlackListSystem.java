/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

import BusinessLayer.Review;

/**
 * Responsible for checking if review is suitable or not
 */
class BlackListSystem 
{
    /**
     * Checks if the review test contains unsuitable text
     * @param review to check
     * @return true if unsuitable, false otherwise
     */
    Boolean IsReviewSuitable(Review review) 
    {
        return !review.getText().matches("hate");
    }    
}
