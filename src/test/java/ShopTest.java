import Actions.ISell;
import Shop.Shop;

import Instruments.Dobro;
import Instruments.Mandolin;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {

    private Shop shop;
    private ArrayList<ISell> instruments = new ArrayList<ISell>();

    private ISell dobro;
    private ISell mandolin;


    @Before
    public void before() {

        dobro = new Dobro("wood", "acoustic", 6);
        mandolin = new Mandolin("wood", "acoustic", 8);

        instruments.add(dobro);
        instruments.add(mandolin);

        shop = new Shop(instruments);
    }

    @Test
    public void getStock() {
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canAdd() {
        shop.addInstrument(dobro);
        assertEquals(3, shop.getStock().size());
    }

    @Test
    public void canRemove() {
        shop.removeInstrument(dobro);
        assertEquals(1, shop.getStock().size());
    }
}
