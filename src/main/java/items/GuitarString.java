package items;

import behaviours.ISell;

public class GuitarString implements ISell {

    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public GuitarString(String description, double buyingPrice, double sellingPrice) {
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

    public double calculateMarkup() {
        return sellingPrice -= buyingPrice;
    }
}
