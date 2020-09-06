import items.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("drumSticks", 5.00, 10.00);
    }

    @Test
    public void hasDescription() {
        assertEquals("drumSticks", drumSticks.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(5.00, drumSticks.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(10.00, drumSticks.getSellingPrice(), 0.01);
    }
}
