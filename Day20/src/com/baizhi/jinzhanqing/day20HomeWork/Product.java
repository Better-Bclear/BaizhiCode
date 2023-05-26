package com.baizhi.jinzhanqing.day20HomeWork;

import java.util.Objects;

public class Product {
    private String productName;
    private double price;
    private int count;
    private String address;

    public Product() {
    }

    public Product(String productName, double price, int count, String address) {
        this.productName = productName;
        this.price = price;
        this.count = count;
        this.address = address;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", address='" + address + '\'' +
                '}';
    }
}
