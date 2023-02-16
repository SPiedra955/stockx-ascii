package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Asks implements Criteria{

    public Asks(){};

    @Override
    public List<Offer> checkCriteria(Item sneaker){
        return sneaker.offers().stream().filter(e -> e instanceof Ask)
                      .collect(Collectors.toList());
    }


    
}
