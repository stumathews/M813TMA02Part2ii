/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BOLO;

import java.util.Objects;

/**
 * Product that can be purchased. 
 * It consists of a purchase price(cost) and a product name
 */
public class Product
{
   
    private final String name;
    private final float cost;
    
    public Product(String name, float cost)
    {
        this.name = name;
        this.cost = cost;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getCost() 
    {
        return cost; 
    };
    
    //Auto Generated
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Float.floatToIntBits(this.cost);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (Float.floatToIntBits(this.cost) != Float.floatToIntBits(other.cost)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
}