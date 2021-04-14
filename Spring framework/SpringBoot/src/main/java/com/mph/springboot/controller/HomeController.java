package com.mph.springboot.controller;


import com.mph.springboot.model.Product;
import com.mph.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping(path="/api/product")
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping("/allProducts")
    public List<Product> home(){

        return productService.getProducts();
    }

}


//    @GetMapping("/welcome")
//    public String home() {
//        return "welcome";
//    }