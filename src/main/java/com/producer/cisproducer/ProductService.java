package com.producer.cisproducer;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  List<Product> list = new ArrayList<>();

  public ProductService() {
    this.list.add(new Product("Nintendo 64", 65));
    this.list.add(new Product("Mongoose", 75));
    this.list.add(new Product("Playstation", 120));
  }

  public Product find(int id) {
    return list.get(id);
  }

  public Product findByString(String name) {
    for(Product prod: list) {
      if(prod.getName().contains(name)){
        return prod;
      }
    }
    return null;
  }

  public Product findBy(Product product) {
    for(Product prod: list) {
      if(prod.getName().equals(product.getName())){
        return prod;
      }
    }
    return null;
  }
}
