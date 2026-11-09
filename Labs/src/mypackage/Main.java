package mypackage;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(100.0d);
        product.setDiscount(20d);
        //Outputs Selling Price 80.000000
        System.out.format("Selling Price %f%n", product.getSellingPrice());
    }
}