package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Sale;
import edu.craptocraft.stockx.item.Sneaker;

public class LastSaleTest {

    @Test
    public void TestLastSale(){

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        LastSale sale = new LastSale();

        sneaker.add(new Sale("9.5", 870));
        sneaker.add(new Sale("9.5", 789));
        sneaker.add(new Sale("9.5", 560));

        assertEquals(560, sale.checkCriteria(sneaker).get(0).value());

        sneaker.add(new Sale("9.5", 999));

        assertEquals(999, sale.checkCriteria(sneaker).get(0).value());

    }
    
}
