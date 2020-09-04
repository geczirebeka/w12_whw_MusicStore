package instruments;

public class Piano extends Instrument {

    private int numberOfPedals;

    public Piano(String material, String colour, InstrumentType instrumentType, int numberOfPedals) {
        super(material, colour, instrumentType);
        this.numberOfPedals = numberOfPedals;
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }
}
