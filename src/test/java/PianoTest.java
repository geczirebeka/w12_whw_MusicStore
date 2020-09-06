import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("Wood", "Black", InstrumentType.KEYBOARD, 3, "piano", 2500.00, 4000.00);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }

    @Test
    public void hasNumberOfPedals() {
        assertEquals(3, piano.getNumberOfPedals());
    }

    @Test
    public void hasDescription() {
        assertEquals("piano", piano.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(2500.00, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(4000.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("Tra la la, la la", piano.play());
    }
}
