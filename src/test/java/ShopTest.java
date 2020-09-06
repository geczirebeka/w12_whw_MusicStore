import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Piano;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar("Wood", "Black", InstrumentType.STRING, 6, "guitar", 400.00, 600.00);
        piano = new Piano("Wood", "Black", InstrumentType.KEYBOARD, 3, "piano", 2500.00, 4000.00);
        trumpet = new Trumpet("Brass", "Gold", InstrumentType.BRASS, 3, "trumpet", 350.00, 500.00);
    }

    @Test
    public void shopStartsEmpty() {
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddItemToStock() {
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItemToStock(guitar);
        shop.removeItemFromStock(guitar);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canCalculateTotalProfit() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(piano);
        shop.addItemToStock(trumpet);
        assertEquals(1850.00, shop.totalProfit(), 0.01);
    }
}
