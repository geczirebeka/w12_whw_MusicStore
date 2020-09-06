import instruments.InstrumentType;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("Brass", "Black", InstrumentType.WOODWIND, "saxophone", 300.00, 390.00);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", saxophone.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.WOODWIND, saxophone.getInstrumentType());
    }

    @Test
    public void hasDescription() {
        assertEquals("saxophone", saxophone.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(300.00, saxophone.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(390.00, saxophone.getSellingPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Tu, tu tu tuuu", saxophone.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(90.00, saxophone.calculateMarkup(), 0.01);
    }
}
