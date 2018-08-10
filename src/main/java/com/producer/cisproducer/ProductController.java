package com.producer.cisproducer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  public ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/find/{id}")
  public Product locateProduct(@PathVariable("id") int id){
    return productService.find(id);
  }

//  @PostMapping("/describe")
//  public Product returnObject(@RequestParam("name") String name){
//    return productService.findByString(name);
//  }

  @PostMapping("/describe")
  public Product returnObject(@RequestParam("name") Product product){
    return productService.findBy(product);
  }

}
