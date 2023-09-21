package Song_Thu_Gifts.service.Impl;

import Song_Thu_Gifts.model.entity.Product;
import Song_Thu_Gifts.repository.ProductRepository;
import Song_Thu_Gifts.service.ProductService;
import Song_Thu_Gifts.util.ApplicationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ApplicationMapper mapper;
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> searchProductByName(String searchText) {
        return productRepository.findProductByProductNameContainingIgnoreCase(searchText);
    }
}
