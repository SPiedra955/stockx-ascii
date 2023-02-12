package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Sneaker;

public class SizeTest {
    
    @Test
    public void TestSize(){

        Size sneakersSize = new Size("8.5");
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        sneaker.add(new Ask("8.5", 452));
        sneaker.add(new Ask("9.5", 650));
        sneaker.add(new Ask("8.5", 510));

        assertEquals(2, sneakersSize.checkCriteria(sneaker).size());
    }
}
