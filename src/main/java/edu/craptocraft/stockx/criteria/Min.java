package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<Offer> checkCriteria(Item sneaker){

        Criteria minCriteria = new AndCriteria(criteria, otherCriteria);
        List<Offer> criteriaMin = minCriteria.checkCriteria(sneaker).stream().min(Offer::compareTo)
        .stream().collect(Collectors.toList());

        return criteriaMin;

    }
    
}
