package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.*;
import edu.craptocraft.stockx.item.Bid;

public class Bids implements Criteria{

    public Bids(){};

    @Override
    public List<Offer> checkCriteria(Item sneakers){

        return sneakers.offers().stream().filter(e -> e instanceof Bid)
                       .collect(Collectors.toList());
        
    }
}
