/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tma02partaii;

/**
 *
 * @author cex
 */
class BlackListSystem {

    Boolean IsReviewSuitable(Review review) 
    {
        return !review.getText().matches("hate");
    }
    
}
