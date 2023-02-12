package edu.craptocraft.stockx.item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SneakerTest {

    @Test
    public void TestSneaker(){
        Sneaker test = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        assertEquals("Jordan 1 Retro High Dark Mocha", test.getStyle());
        assertEquals("555088-105", test.getName());
    }

    
}
