package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class MaxBid implements Criteria{

    public MaxBid(){};

    @Override
    public List<Offer> checkCriteria(Item sneaker){
        return sneaker.offers().stream().filter(e -> e instanceof Bid).
                    max(Offer::compareTo).stream()
                    .collect(Collectors.toList());
    }
    
}
