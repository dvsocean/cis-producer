package com.scc;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.when;
import static org.junit.Assert.assertEquals;

import com.producer.cisproducer.CisProducerApplication;
import com.producer.cisproducer.Product;
import com.producer.cisproducer.ProductController;
import com.producer.cisproducer.ProductService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CisProducerApplication.class)
public class ProductsBase {

  @Autowired
  private ProductController productController;

  @MockBean
  private ProductService productService;

  @Before public void setup() {
    RestAssuredMockMvc.standaloneSetup(productController);
    Product pr = new Product("Nintendo 64", 65);
    Mockito.when(productService.find(1)).thenReturn(pr);
  }

  @Test
  public void testOne(){
    
  }
}
