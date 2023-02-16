package edu.craptocraft.stockx.criteria;

import java.util.List;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public interface Criteria {

    public List<Offer> checkCriteria(Item sneaker);
    
}
