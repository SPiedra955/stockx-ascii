package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Sneaker;

public class MaxBidTest {

    @Test
    public void TestMaxBid(){
        
    Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
    Criteria max = new MaxBid();
    
    sneaker.add(new Bid("8.5", 758));
    sneaker.add(new Bid("6.5", 450));
    sneaker.add(new Bid("9.5", 760));
    sneaker.add(new Bid("5.5", 578));

    assertEquals(1, max.checkCriteria(sneaker).size());
    assertEquals(760, max.checkCriteria(sneaker).get(0).value());
    assertEquals("9.5", max.checkCriteria(sneaker).get(0).size());
    
    }
    
}
