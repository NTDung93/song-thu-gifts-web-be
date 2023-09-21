package Song_Thu_Gifts.controller;

import Song_Thu_Gifts.model.dto.ProductDto;
import Song_Thu_Gifts.service.Impl.ProductServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/product")
public class ProductController extends AbstractApplicationController {
    private final ProductServiceImpl productServiceImpl;

    public ProductController(ProductServiceImpl productServiceImpl) {
        this.productServiceImpl = productServiceImpl;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ProductDto>> getAllProducts() {
        List<ProductDto> products = productServiceImpl.getAllProducts()
                .stream()
                .map(mapper::productToProductDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/search")
    public List<ProductDto> search(@RequestParam(required = false) String searchText) {
        return productServiceImpl.searchProductByName(searchText)
                .stream()
                .map(mapper::productToProductDto)
                .collect(Collectors.toList());
    }
}
