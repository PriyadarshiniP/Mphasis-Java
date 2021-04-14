package com.mph.spring.service;

import com.mph.spring.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {
    private static Map<String, Product> productRepo = new HashMap<>();

    static{
        productRepo.put("1",new Product("1","honey"));
        productRepo.put("2",new Product("2","almond"));
    }

    //fetches all the products from the map
    public ResponseEntity<Object> getProducts() {

        return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
    }

    //Adds new product to the map
    public ResponseEntity<Object> postProduct(Product product) {
        productRepo.put(product.getId(), product);
       return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
    }

    //updates the product details based on the id
    public ResponseEntity<Object> putProduct(String id, Product product) {
        productRepo.remove(id);
        product.setId(id);
        productRepo.put(id, product);
        return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
    }

    //deletes the product based on its id
    public ResponseEntity<Object> deleteProduct(String id) {
        productRepo.remove(id);
        return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
    }

}
