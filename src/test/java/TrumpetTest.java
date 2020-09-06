import instruments.InstrumentType;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("Brass", "Gold", InstrumentType.BRASS, 3, "trumpet", 350.00, 500.00);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Gold", trumpet.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
    }

    @Test
    public void hasNumberOfValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void hasDescription() {
        assertEquals("trumpet", trumpet.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(350.00, trumpet.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(500.00, trumpet.getSellingPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Tululululuuu", trumpet.play());
    }
}
