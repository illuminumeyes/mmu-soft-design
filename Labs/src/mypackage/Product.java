package mypackage;
public class Product {
    double discount = 0d;
    double fullPrice;
    double sellingPrice;

    Product(double fullPrice)
    {
        this(fullPrice, 0d);
    }
    Product(double fullPrice, double discount)
    {
        this.fullPrice = fullPrice;
        this.discount = discount;
        setSellingPrice();
    }
    void setDiscount(double discount) {
        //check pre- and post-conditions
        this.discount = discount;
        setSellingPrice();
    }
    void setFullPrice(double fullPrice) {
        //check pre- and post-conditions
        this.fullPrice = fullPrice;
        setSellingPrice();
    }
    double getSellingPrice() {
        return sellingPrice;
    }
    void setSellingPrice() {
        sellingPrice = fullPrice - discount;
    }
}
