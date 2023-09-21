package Song_Thu_Gifts.util;

import Song_Thu_Gifts.model.dto.CategoryDto;
import Song_Thu_Gifts.model.dto.ProductDto;
import Song_Thu_Gifts.model.entity.Category;
import Song_Thu_Gifts.model.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ApplicationMapper {
    public ProductDto productToProductDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setProductNumber(product.getProductNumber());
        productDto.setProductName(product.getProductName());
        productDto.setProductDescription(product.getProductDescription());
        productDto.setProductImage(product.getProductImage());
        productDto.setProductPrice(product.getProductPrice());
        productDto.setProductQuantity(product.getProductQuantity());
        productDto.setProductStatus(product.getProductStatus());
        productDto.setProductDiscount(product.getProductDiscount());
        productDto.setProductRating(product.getProductRating());
        productDto.setCategoryId(product.getCategory().getId());
        return productDto;
    }

    public Product productDtoToProductEntity(ProductDto productDto){
        Product product = new Product();
        if(productDto.getId() != null){
            product.setId(productDto.getId());
        }
        product.setProductNumber(productDto.getProductNumber());
        product.setProductName(productDto.getProductName());
        product.setProductDescription(productDto.getProductDescription());
        product.setProductImage(productDto.getProductImage());
        product.setProductPrice(productDto.getProductPrice());
        product.setProductQuantity(productDto.getProductQuantity());
        product.setProductStatus(productDto.getProductStatus());
        product.setProductDiscount(productDto.getProductDiscount());
        product.setProductRating(productDto.getProductRating());
        return product;
    }

    public CategoryDto categoryToCategoryDto(Category category){
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setCategoryName(category.getCategoryName());
        categoryDto.setCategoryDescription(category.getCategoryDescription());
        return categoryDto;
    }

    public Category categoryDtoToCategoryEntity(CategoryDto categoryDto){
        Category category = new Category();
        if(categoryDto.getId() != null){
            category.setId(categoryDto.getId());
        }
        category.setCategoryName(categoryDto.getCategoryName());
        category.setCategoryDescription(categoryDto.getCategoryDescription());
        return category;
    }
}
