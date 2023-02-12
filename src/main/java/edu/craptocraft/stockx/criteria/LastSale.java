package edu.craptocraft.stockx.criteria;

import java.util.List;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Offer;

public class LastSale implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneakers){

        Criteria lastSale = new Sales();

        List<Offer> salesList = lastSale.checkCriteria(sneakers);

        return salesList.isEmpty() ? List.of() : List.of(salesList.get(salesList.size() - 1));                  
    }
    
}
