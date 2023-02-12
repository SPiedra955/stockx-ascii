package edu.craptocraft.stockx.item;

public class Ask implements Offer{

    private String size;
    private Integer ask;

    public Ask(String size, int bid){
        this.size = size;
        this.ask = bid;
    }

    @Override
    public String size(){
        return this.size;
    }

    @Override
    public int value(){
        return this.ask;
    }

    @Override
    public int compareTo(Offer offer){
        return this.ask.compareTo(offer.value());
    }
    
    @Override
    public String toString() {


        return "\t\t" + size() + "\t" + value() + "\n";
    }
}
