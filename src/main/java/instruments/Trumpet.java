package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {

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

    public double calculateMarkup() {
        return sellingPrice -= buyingPrice;
    }
}
