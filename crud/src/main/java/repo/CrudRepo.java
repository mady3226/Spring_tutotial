package repo;

import model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepo extends JpaRepository<Product, Integer> {

}
