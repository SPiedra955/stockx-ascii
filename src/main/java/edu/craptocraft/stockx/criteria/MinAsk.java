package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class MinAsk implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneakers){

        return sneakers.offers().stream().filter(c -> c instanceof Ask).
                        min(Offer::compareTo).stream().collect(Collectors.toList());
    }
    
}
