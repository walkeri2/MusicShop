import Instruments.Dobro;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DobroTest {

    private Dobro dobro;

    @Before
    public void before() {
        dobro = new Dobro("wood", "acoustic", 6);
    }

    @Test
    public void play() {
        assertEquals("twang", dobro.play());
    }

    @Test
    public void getMaterial() {
        assertEquals("wood", dobro.getMaterial());
    }

    @Test
    public void getType() {
        assertEquals("acoustic", dobro.getType());
    }

    @Test
    public void canCountStrings() {
        assertEquals(6, dobro.getStringCount());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(400, dobro.markup());

    }
}
