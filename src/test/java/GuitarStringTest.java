import items.DrumSticks;
import items.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before() {
        guitarString = new GuitarString ("guitarString", 2.00, 2.50);
    }

    @Test
    public void hasDescription() {
        assertEquals("guitarString", guitarString.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(2.00, guitarString.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(2.50, guitarString.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(0.50, guitarString.calculateMarkup(), 0.01);
    }
}
