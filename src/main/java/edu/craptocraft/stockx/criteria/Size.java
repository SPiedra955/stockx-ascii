package edu.craptocraft.stockx.criteria;

import edu.craptocraft.stockx.item.Item;
import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.*;

public class Size implements Criteria {

    public String size = "";

    public Size(String size){
            this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneakers){

        return sneakers.offers().stream().filter(e -> e.size() == this.size).
                        collect(Collectors.toList());
    }
}
    
