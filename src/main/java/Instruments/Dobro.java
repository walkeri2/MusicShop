package Instruments;

import Actions.IPlay;
import Actions.ISell;


public class Dobro extends Instrument implements IPlay, ISell {

    private int stringCount;
    private int purchased;
    private int selling;

    public Dobro(String material, String type, int stringCount) {
        super(material, type);
        this.stringCount = stringCount;
        this.purchased = 800;
        this.selling = 1200;
    }

    public String play() {
        return "twang";
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