package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Max implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public Max(Criteria criteria, Criteria otherCriteria){

        this.criteria = criteria;
        this.otherCriteria = otherCriteria;

    }

    @Override 
    public List<Offer> checkCriteria(Item sneakers){

        Criteria maxCriteria = new AndCriteria(criteria, otherCriteria);

        Optional<Offer> offer = maxCriteria.checkCriteria(sneakers).stream().
                                      max(Offer::compareTo);

        return offer.stream().collect(Collectors.toList());

    }
    
}
