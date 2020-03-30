import Instruments.Dobro;
import Instruments.Mandolin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MandolinTest {

    private Mandolin mandolin;

    @Before
    public void before() {
        mandolin = new Mandolin("wood", "acoustic", 8);
    }

    @Test
    public void play() {
        assertEquals("chop", mandolin.play());
    }

    @Test
    public void getMaterial() {
        assertEquals("wood", mandolin.getMaterial());
    }

    @Test
    public void getType() {
        assertEquals("acoustic", mandolin.getType());
    }

    @Test
    public void canCountStrings() {
        assertEquals(8, mandolin.getStringCount());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(500, mandolin.markup());

    }
}

