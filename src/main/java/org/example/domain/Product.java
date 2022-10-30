package org.example.domain;

public class Product {
    private  int productID;
    private String productNAME;
    private String productINFO;
    private float productPRICE;
    private int productRating;
    private int productQuantity;

    public Product(int productID, String productNAME, String productINFO, float productPRICE, int productRating, int productQuantity) {

        this.productID = productID;
        this.productNAME = productNAME;
        this.productINFO = productINFO;
        this.productPRICE = productPRICE;
        this.productRating = productRating;
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productNAME='" + productNAME + '\'' +
                ", productINFO='" + productINFO + '\'' +
                ", productPRICE=" + productPRICE +
                ", productRating=" + productRating +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
