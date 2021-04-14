package com.mph.spring.controller;
import com.mph.spring.model.Product;
import com.mph.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
    public class ProductServiceController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
        public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
           return productService.putProduct(id,product);
        }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
        public ResponseEntity<Object> createProduct(@RequestBody Product product) {
            return productService.postProduct(product);
        }

    @GetMapping("/allProducts")
    public ResponseEntity<Object> home(){
        return productService.getProducts();
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
          return productService.deleteProduct(id);
    }

    }

