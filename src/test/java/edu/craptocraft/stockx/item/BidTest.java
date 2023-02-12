package edu.craptocraft.stockx.item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BidTest {

    @Test 
    public void TestBid(){

        Bid sneaker = new Bid("13", 338);

        assertEquals("13", sneaker.size());
        assertEquals(338, sneaker.value());
    }

}
