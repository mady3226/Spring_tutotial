package services;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.CrudRepo;

import java.util.List;

@Service
public class CrudService {

    @Autowired
    private CrudRepo repo ;

    public List<Product> ProductList(){

        return repo.findAll();
    }
}
