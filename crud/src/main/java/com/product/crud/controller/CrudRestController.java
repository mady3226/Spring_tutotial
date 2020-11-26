package com.product.crud.controller;

import com.product.crud.model.Product;
import com.product.crud.services.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/* Cette annation permet de déclarer un rest com.product.crud.controller,
 * elle vaut : @Controller + @ReponseBody */
@RestController
public class CrudRestController {
    /* Cette annotation va permettre de faire l'injection de dépendances entre les beans de l'application
     * (Spring va tout faire ). Autrement : cette annation permet de spécifier une variable d'instance à
     * renseigner par spring
     *  */
    @Autowired
    private CrudService service;


    @GetMapping("/")
    public String home() {

        return "Home page";
    }

    /* Cette annotation permet d'associer une adresse url, à un com.product.crud.controller ou une méthode du com.product.crud.controller*/
    @GetMapping("/getproductlist")
    public List<Product> ProductList(){
        List<Product> products = new ArrayList<Product>();
        products = service.ProductList();
        return products;
    }

    /* Cette annotation permet d'associer une adresse url, à un com.product.crud.controller ou une méthode du com.product.crud.controller*/
    @PostMapping("/addproduct")
    public Product AddProduct(@RequestBody Product product){
        return service.AddProduct(product);
    }

    @GetMapping("/getproduct/{id}")
    public Product ProductById(@PathVariable int id){
            return service.ProductById(id).get();
    }

    @GetMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable int id){
            return service.deleteProduct(id);
    }
}
