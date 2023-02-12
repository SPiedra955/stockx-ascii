package edu.craptocraft.stockx.criteria;

import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.*;
import java.util.*;

public class Asks implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneakers){

        return sneakers.offers().stream().filter(d -> d instanceof Ask)
                       .collect(Collectors.toList());
        
    }
}
