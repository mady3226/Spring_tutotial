package com.product.crud.services;

import com.product.crud.model.Product;
import com.product.crud.repo.CrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrudService {

    @Autowired
    private CrudRepo repo ;

    public List<Product> ProductList(){

        return repo.findAll();
    }

    public Product AddProduct (Product product){
        return repo.save(product);
    }

    public Optional<Product> ProductById(int id){
        return repo.findById(id);
    }

    public String deleteProduct(int id){

        String result;

         try{
             repo.deleteById(id);
             result = "Product with id" + id + " is deleted !";
         }catch (Exception e){
             result = "Product with id" + id + " is not deleted !";

         }
         return result;
    }
}
