package Orders;

import tma02partaii.Customer;
import tma02partaii.Product;
import tma02partaii.Warehouse;

/**
 * Responsible for manages the ordering process
 */
public class OrderSystem 
{ 
    private final Warehouse warehouse;
    
    public OrderSystem()
    {        
        this.warehouse = new Warehouse(Test.TestData.Stock);
    }
    
    // ctor used for testing mainly
    public OrderSystem(Warehouse warehouse)
    {
        this.warehouse = warehouse;
    }  
    
    /**
     * Adds a product to a customer's order
     * @param product
     * @param customer
     * @param order 
     */
    public void AddProductToOrder(Product product, Customer customer, Order order)
    {        
        order.AddProductToOrder(product);
    }
    
    /**
     * Checks with warehouse if the product is stocked
     * @param product to check
     * @return true if stocked, false otherwise
     */
    public Boolean IsProductStocked(Product product)
    {
        return warehouse.IsProductStocked(product);
    }
    
    /**
     * Decreases the inventory of the product in the warehouse
     * @param product to decrease
     * Note: Decreases by intervals of 1
     */
    public void DecreaseInventory(Product product)
    {
        warehouse.DecreaseInventory(product);
    }
}