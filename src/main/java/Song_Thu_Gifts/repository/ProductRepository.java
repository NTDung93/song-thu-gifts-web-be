package Song_Thu_Gifts.repository;

import Song_Thu_Gifts.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    void deleteProductById(Long id);

    List<Product> findProductByProductNameContainingIgnoreCase(String searchText);
}
