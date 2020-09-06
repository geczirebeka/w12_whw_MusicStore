package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private int numberOfPedals;
    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public Piano(String material, String colour, InstrumentType instrumentType, int numberOfPedals, String description, double buyingPrice, double sellingPrice) {
        super(material, colour, instrumentType);
        this.numberOfPedals = numberOfPedals;
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
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
        return "Tra la la, la la";
    }

    public double calculateMarkup() {
        return sellingPrice -= buyingPrice;
    }
}
