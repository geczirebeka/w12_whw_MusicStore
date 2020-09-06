package instruments;

import behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private int numberOfValves;
    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public Trumpet(String material, String colour, InstrumentType instrumentType, int numberOfValves, String description, double buyingPrice, double sellingPrice) {
        super(material, colour, instrumentType);
        this.numberOfValves = numberOfValves;
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public int getNumberOfValves() {
        return numberOfValves;
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
        return "Tululululuuu";
    }
}
