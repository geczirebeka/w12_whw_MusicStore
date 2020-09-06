import items.GuitarString;
import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("sheetMusic", 2.00, 2.50);
    }

    @Test
    public void hasDescription() {
        assertEquals("sheetMusic", sheetMusic.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(2.00, sheetMusic.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(2.50, sheetMusic.getSellingPrice(), 0.01);
    }
}
