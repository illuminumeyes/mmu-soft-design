package polymorphicsellingpriceproduct;

class Product {

    private final MinimumPrice minimumPrice;
    private SellingPrice sellingPrice;
    private final ShippingCost shippingCost;

    public Product(FullPrice fullPrice, MinimumPrice minimumPrice, ShippingCost shippingCost) {
        this.sellingPrice = fullPrice;
        this.minimumPrice = minimumPrice;
        this.shippingCost = shippingCost;
    }

    public void applyDiscount(Discount discount) {

        sellingPrice = sellingPrice.applyDiscount(minimumPrice, discount);
    }

    public void removeDiscount() {

        sellingPrice = sellingPrice.removeDiscount();
    }

    public double getPrice() {
        return sellingPrice.get();
    }

    public ShippingCost getShippingCost() {
        return shippingCost;
    }

    public double getTotalCost() {return sellingPrice.get() + shippingCost.get();}
}
