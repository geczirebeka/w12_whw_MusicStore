package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;
    private String description;
    private double buyingPrice;
    private double sellingPrice;

    public Guitar(String material, String colour, InstrumentType instrumentType, int numberOfStrings, String description, double buyingPrice, double sellingPrice) {
        super(material, colour, instrumentType);
        this.numberOfStrings = numberOfStrings;
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
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
}
