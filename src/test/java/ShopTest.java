import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar("Wood", "Black", InstrumentType.STRING, 6, "guitar", 400.00, 600.00);
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
}
