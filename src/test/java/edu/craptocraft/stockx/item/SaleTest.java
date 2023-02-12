package edu.craptocraft.stockx.item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SaleTest {

    @Test
    public void TestSale(){
        Sale sneakers = new Sale("8", 500);
        assertEquals("8", sneakers.size());
        assertEquals(500, sneakers.value());
    }
    
}
