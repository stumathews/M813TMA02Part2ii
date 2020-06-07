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
class ProductOutOfStock extends Exception 
{
    private final Product product;
    public ProductOutOfStock(Product product)
    {
        this.product = product;        
    }
    
    @Override
    public String getMessage()
    {
        return "Product " + product.getName() + " is out of stock";
    }
}
