package edu.craptocraft.stockx.criteria;

import java.util.List;

import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class LastSale implements Criteria{

    public LastSale(){};

    @Override
    public List<Offer> checkCriteria(Item sneaker){

        Criteria lastSale = new Sales();

        List<Offer> listSale = lastSale.checkCriteria(sneaker);

        return listSale.isEmpty() ? List.of() : List.of(listSale.get(listSale.size() - 1));

    }

    
}
