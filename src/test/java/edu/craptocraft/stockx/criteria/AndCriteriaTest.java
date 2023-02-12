package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Sneaker;

public class AndCriteriaTest {

    @Test
    public void TestAndCriteria(){

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        Size criteria = new Size("9.5");
        Bids otherCriteria = new Bids();

        sneaker.add(new Bid("9.5", 453));
        sneaker.add(new Bid("8.5", 458));
        sneaker.add(new Bid("9.5", 520));
        sneaker.add(new Bid("7.5", 451));

        AndCriteria size = new AndCriteria(criteria, otherCriteria);
        assertEquals(2, size.checkCriteria(sneaker).size());
        assertEquals(453, size.checkCriteria(sneaker).get(0).value());
        assertEquals(520, size.checkCriteria(sneaker).get(1).value());
        assertEquals("9.5", size.checkCriteria(sneaker).get(0).size());
        assertEquals("9.5", size.checkCriteria(sneaker).get(1).size());

    }
    
}
