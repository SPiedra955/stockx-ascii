package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Sale;
import edu.craptocraft.stockx.item.Sneaker;

public class AsksTest {

    @Test
    public void asksCriteriaTest(){
 
        Criteria asks = new Asks();
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        sneaker.add(new Ask("8.5", 758));
        sneaker.add(new Ask("6.5", 450));
        sneaker.add(new Bid("9", 750));
        sneaker.add(new Bid("5.5", 578));
        sneaker.add(new Sale("4.5", 400));
        sneaker.add(new Sale("9.5", 479));

        assertEquals(2,asks.checkCriteria(sneaker).size());
    }
}
