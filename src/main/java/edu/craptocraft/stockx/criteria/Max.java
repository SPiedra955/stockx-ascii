package edu.craptocraft.stockx.criteria;

import java.util.List;
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
    public List<Offer> checkCriteria(Item shoes){

        Criteria MaxCriteria =  new AndCriteria(criteria, otherCriteria);

        List<Offer> maxValue = MaxCriteria.checkCriteria(shoes).stream().
             max(Offer::compareTo).stream().collect(Collectors.toList());

        return maxValue;
        
    }
    
}
