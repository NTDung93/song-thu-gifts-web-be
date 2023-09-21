package Song_Thu_Gifts.service.Impl;

import Song_Thu_Gifts.model.entity.Category;
import Song_Thu_Gifts.repository.CategoryRepository;
import Song_Thu_Gifts.repository.ProductRepository;
import Song_Thu_Gifts.service.CategoryService;
import Song_Thu_Gifts.util.ApplicationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ApplicationMapper mapper;
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
