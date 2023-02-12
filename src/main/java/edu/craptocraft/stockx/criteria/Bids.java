package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Bids implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneakers){

        return sneakers.offers().stream().filter(e -> e instanceof Bid)
                       .collect(Collectors.toList());
    }
    
}
