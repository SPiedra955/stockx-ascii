package edu.craptocraft.stockx.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item{
    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;
    private List<Offer> offers = new ArrayList<Offer>();

    public Sneaker(String name, String style){
        this.name = name;
        this.style = style;
    }

    public String getStyle(){
        return this.style;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public int getSale(){
        return this.sale;
    }

    @Override
    public void setSale(int sale){
        this.sale = sale;
    }

    @Override
    public int getBid(){
        return this.bid;
    }

    @Override
    public void setBid(int bid){
        this.bid = bid;
    }

    @Override
    public int getAsk(){
        return this.ask;
    }

    @Override
    public void setAsk(int ask){
        this.ask = ask;
    }

    @Override
    public void add(Offer offer){
        offers().add(offer);
    }

    @Override
    public List<Offer> offers(){
        return this.offers;
        
    }

    public String toString(){

        StringBuilder sneakers = new StringBuilder();

        sneakers.append(style + " " + name);
        
        return sneakers.toString();
        
    }
    
}
