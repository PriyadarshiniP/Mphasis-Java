package com.mph.springboot.service;

import com.mph.springboot.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public List<Product> getProducts(){
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(1,"Pencil",100));
        products.add(new Product(2,"pen",20));
        return products;
    }



}
