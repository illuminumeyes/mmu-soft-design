package polymorphicsellingpriceproduct;

import java.util.Objects;

class ShippingCost implements SellingPrice{
    static final ShippingCost ZERO = new ShippingCost();
    private static final double NO_PRICE = 0.0d;
    final private double price;

    private ShippingCost(){this(NO_PRICE)};

    public ShippingCost(double price){this.price = price; }

    @Override
    public boolean equals (Object o){
        if (o instanceof SelleingPrice other) {
            return price == other.get();
        } else return false;
    }

    @Override
    public int hashCode(){return Objects.hashCode(price);}

    @Override
    public String toString(){
        return "ShippingCost{" +
                "price=" + price +
                '}';
    }

    @Override
    public double get() {
        return price;
    }
}