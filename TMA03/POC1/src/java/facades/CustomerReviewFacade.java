/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import DataAccessLayer.CustomerReview;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cex
 */
@Stateless
public class CustomerReviewFacade extends AbstractFacade<CustomerReview> {

    @PersistenceContext(unitName = "POC1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerReviewFacade() {
        super(CustomerReview.class);
    }
    
}
