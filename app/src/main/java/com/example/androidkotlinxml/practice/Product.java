package com.example.androidkotlinxml.practice;

import android.util.Log;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Product {
    ArrayList<Product> productsList = new ArrayList();
    private String name;
    private double price;
    private double tax;

    public Product() {
    }

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product addProductToList(@NonNull Product product) {
        productsList.add(product);
        return product;
    }

    public ArrayList<Product> getProductsList() {
        return productsList;
    }

    public Product enterProductItem(String name, double price, double tax) {
        Product product = new Product(name, price, tax);
        productsList.add(product);
        return product;
    }

    public double getTaxPrice(double price, double tax) {
        return price * tax;
    }

    public void printProductItem(@NonNull Product product) {
        Log.d("Product information", product.getName() + " " + product.getPrice() + " " + product.getTax());
    }
}