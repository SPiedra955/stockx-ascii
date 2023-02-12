package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Sneaker;

public class BidsTest {

    @Test
    public void TestBids(){

     
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        Criteria bids = new Bids();

        Bid bid = new Bid("7.5", 260);
        Bid first_bid = new Bid("9", 300);
        Bid second_bid = new Bid("6.5", 400);
        Ask ask = new Ask("9", 200);
        Ask first_ask = new Ask("5.5", 400);
        Ask second_ask = new Ask("8.5", 600);

        sneaker.add(bid);
        sneaker.add(first_bid);
        sneaker.add(second_bid);
        sneaker.add(ask);
        sneaker.add(first_ask);
        sneaker.add(second_ask);

        assertEquals(3, bids.checkCriteria(sneaker).size());
        
    }
    
}
