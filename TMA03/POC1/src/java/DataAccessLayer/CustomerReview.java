/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class CustomerReview implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;  

    /**
     * Many CustomerReviews can belong to one customer
     */
    
    @ManyToOne
    private Customer customer;
  
    /**
     * Many CustomerReviews can be for a product.
     * Note: Need to constrain a customer review and product to be unique ie
     * Only one customer review can exist for one particular product so we need
     * a composite primary key of customer and product
     */    
    @ManyToOne
    private Product product;
    
    /**
     * One customerReview has a single review
     */
    @OneToOne
    private Review review;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerReview)) {
            return false;
        }
        CustomerReview other = (CustomerReview) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CustomerReview[ id=" + id + " ]";
    }
    
}
