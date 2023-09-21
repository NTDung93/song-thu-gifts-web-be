package Song_Thu_Gifts.controller;

import Song_Thu_Gifts.model.dto.CategoryDto;
import Song_Thu_Gifts.service.Impl.CategoryServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/category")
public class CategoryController extends AbstractApplicationController {

    private final CategoryServiceImpl categoryServiceImpl;

    public CategoryController(CategoryServiceImpl categoryServiceImpl) {
        this.categoryServiceImpl = categoryServiceImpl;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CategoryDto>> getAllCategories() {
        List<CategoryDto> categories = categoryServiceImpl.getAllCategories()
                .stream()
                .map(mapper::categoryToCategoryDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
