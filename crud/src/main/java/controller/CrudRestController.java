package controller;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import services.CrudService;

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
}
