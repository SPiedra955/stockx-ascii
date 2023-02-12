package edu.craptocraft.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;


    public AndCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Offer> checkCriteria(Item sneakers){
        
        List<Offer> firstCoincidence = criteria.checkCriteria(sneakers);
        List<Offer> secondCoincidence = otherCriteria.checkCriteria(sneakers);
        List<Offer> coincidence = new ArrayList<Offer>();

        coincidence.addAll(firstCoincidence);
        coincidence.retainAll(secondCoincidence);

        return coincidence;
        
    }
    
}
