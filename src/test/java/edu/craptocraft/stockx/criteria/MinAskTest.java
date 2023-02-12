package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Sale;
import edu.craptocraft.stockx.item.Sneaker;

public class MinAskTest {
    
    @Test
    public void TestMinAsk(){
        Criteria asks = new MinAsk();
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        sneaker.add(new Ask("9.5", 758));
        sneaker.add(new Ask("9.5", 450));
        sneaker.add(new Bid("9", 750));
        sneaker.add(new Bid("9.5", 578));
        sneaker.add(new Sale("9.5", 400));
        sneaker.add(new Sale("9.5", 479));

        assertEquals(1, asks.checkCriteria(sneaker).size());
        assertEquals(450, asks.checkCriteria(sneaker).get(0).value());
        assertEquals("9.5", asks.checkCriteria(sneaker).get(0).size());
    }
}
