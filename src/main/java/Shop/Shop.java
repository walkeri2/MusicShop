package Shop;

import Actions.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> instruments;

    public Shop (ArrayList<ISell> instruments){
        this.instruments = instruments;
    }

    public ArrayList<ISell> getStock() {
        return instruments;
    }

    public void addInstrument(ISell item){
        instruments.add(item);
    }

    public void removeInstrument(ISell item){
        instruments.remove(item);
    }

}
