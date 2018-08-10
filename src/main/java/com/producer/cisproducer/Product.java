package com.producer.cisproducer;

public class Product {

  private String name;
  private int price;

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCost() {
    return price;
  }

  public void setCost(int cost) {
    this.price = cost;
  }

  public Product find(int id) {
    return null;
  }
}
