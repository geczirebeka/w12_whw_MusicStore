package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Saxophone extends Instrument implements IPlay, ISell {

    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public Saxophone(String material, String colour, InstrumentType instrumentType, String description, double buyingPrice, double sellingPrice) {
        super(material, colour, instrumentType);
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public String play() {
        return "Tu, tu tu tuuu";
    }

    public double calculateMarkup() {
        return sellingPrice -= buyingPrice;
    }
}
