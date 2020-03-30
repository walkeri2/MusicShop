package Instruments;

import Actions.IPlay;
import Actions.ISell;



public class Mandolin extends Instrument implements IPlay, ISell {

    private int stringCount;
    private int purchased;
    private int selling;

    public Mandolin(String material, String type, int stringCount) {
        super(material, type);
        this.stringCount = stringCount;
        this.purchased = 500;
        this.selling = 1000;
    }

    public String play() {
        return "chop";
    }

    public int getStringCount() {
        return stringCount;
    }

    public int getPurchased() {
        return purchased;
    }

    public int getSelling() {
        return selling;
    }

    public int markup() {
        return selling - purchased;
    }
}