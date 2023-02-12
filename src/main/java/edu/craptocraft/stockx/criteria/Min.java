package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.Optional;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class Min implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public Min(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneakers){

        Criteria maxCriteria = new AndCriteria(criteria, otherCriteria);

        Optional<Offer> offer = maxCriteria.checkCriteria(sneakers).stream().
                                min(Offer::compareTo);

        return offer.isPresent() ? List.of(offer.get()) : List.of();

    }
    
}
