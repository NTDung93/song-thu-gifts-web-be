package Song_Thu_Gifts.model.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private int productNumber;
    private String productName;
    private String productDescription;
    private String productImage;
    private double productPrice;
    private int productQuantity;
    private int productStatus;
    private int productDiscount;
    private int productRating;
    private Long categoryId;
}
