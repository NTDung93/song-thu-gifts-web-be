package Song_Thu_Gifts.service;

import Song_Thu_Gifts.model.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    List<Product> searchProductByName(String searchText);
}
