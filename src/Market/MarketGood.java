package Market;

public class MarketGood {
    private String name;
    private int retailPrice;
    private int discountRate;

    public MarketGood(String name, int retailPrice , int discountRate) {
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = discountRate;
    }

    public MarketGood(String name, int retailPrice) {
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public int getDiscountedPrice() {
        float num = (float)discountRate / 10;
        float num1 = (float)retailPrice / 10;
        float num2 = num * num1;
        return retailPrice - (int)num2;
    }
}
