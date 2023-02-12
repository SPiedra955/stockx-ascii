package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Sale;
import edu.craptocraft.stockx.item.Sneaker;

public class SalesTest {

    @Test
    public void TestsSales(){

     
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        Criteria sales = new Sales();

        Bid bid = new Bid("7.5", 260);
        Bid first_bid = new Bid("9", 300);
        Bid second_bid = new Bid("6.5", 400);
        Sale sale = new Sale("9", 200);
        Sale first_sale = new Sale("5.5", 400);
        Sale second_sale = new Sale("8.5", 600);

        sneaker.add(bid);
        sneaker.add(first_bid);
        sneaker.add(second_bid);
        sneaker.add(sale);
        sneaker.add(first_sale);
        sneaker.add(second_sale);

        assertEquals(3, sales.checkCriteria(sneaker).size());
        
    }
    
}
