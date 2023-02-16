package edu.craptocraft.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class AndCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Offer> checkCriteria(Item sneaker){

        List<Offer> firstList = criteria.checkCriteria(sneaker);
        List<Offer> secondList =  otherCriteria.checkCriteria(sneaker);
        List<Offer> matchCriteria = new ArrayList<Offer>();


        matchCriteria.addAll(firstList);
        matchCriteria.retainAll(secondList);


        return matchCriteria;
        
        
    }
    
}
