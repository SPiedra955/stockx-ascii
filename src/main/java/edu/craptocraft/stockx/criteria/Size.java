package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Size implements Criteria{

    private String size = "";

    public Size(String size){
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker){

        return sneaker.offers().stream().filter(e -> e.size() == this.size)
                .collect(Collectors.toList());

    }

}
