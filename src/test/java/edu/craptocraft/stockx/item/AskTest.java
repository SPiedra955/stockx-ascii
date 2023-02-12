package edu.craptocraft.stockx.item;
import static org.junit.Assert.*;

import org.junit.Test;

public class AskTest {

    @Test
    public void TestAsk(){
        Ask sneaker = new Ask("9.5", 479);
        assertEquals("9.5", sneaker.size());
        assertEquals(479, sneaker.value());
    }
    
}
