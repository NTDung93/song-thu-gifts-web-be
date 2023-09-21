package Song_Thu_Gifts.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private int productNumber;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private String productDescription;

    @Column(nullable = false)
    private String productImage;

    @Column(nullable = false)
    private double productPrice;

    @Column(nullable = false)
    private int productQuantity;

    @Column(nullable = false)
    private int productStatus;

    @Column(nullable = false)
    private int productDiscount;

    @Column(nullable = false)
    private int productRating;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;
}
