package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Sneaker;

public class MinTest {

    @Test
    public void TestMin(){
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        Criteria asks = new Size("9.5");
        Criteria bids = new Bids();
        Criteria min = new Min(asks, bids);
        
        sneaker.add(new Bid("9.5", 758));
        sneaker.add(new Bid("9.5", 450));
        sneaker.add(new Bid("9.5", 760));
        sneaker.add(new Bid("9.5", 378));
    
        assertEquals(1, min.checkCriteria(sneaker).size());
        assertEquals(378, min.checkCriteria(sneaker).get(0).value());
        assertEquals("9.5", min.checkCriteria(sneaker).get(0).size());
        
    }
    
}
