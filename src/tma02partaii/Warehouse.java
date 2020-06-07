package tma02partaii;

import java.util.HashMap;

/**
 * Warehouse is responsible for inventory management
 */
public class Warehouse
{
    HashMap<Product, Integer> stock;
    
    /**
     * Initialises are warehouse with initial stock
     * @param initialStock 
     */
    public Warehouse(HashMap<Product, Integer> initialStock )
    {
        stock = initialStock;
    }
    
    /**
     * Checks if the product is stocked
     * @param product
     * @return true if stocked or false otherwise
     */
    public Boolean IsProductStocked(Product product)
    {
        return stock.containsKey(product.getName()) && stock.get(product) > 1;
    }
    
    /**
     * Decreases the stock in the particular product
     * @param product 
     */
    public void DecreaseInventory(Product product)
    {
        if(stock.containsKey(product.getName()))
        {
            int count = stock.get(product.getName());
            stock.put(product, count);
        }
    }
}