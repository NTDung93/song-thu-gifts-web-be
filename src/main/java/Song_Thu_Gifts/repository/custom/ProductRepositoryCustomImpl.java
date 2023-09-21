package Song_Thu_Gifts.repository.custom;

import Song_Thu_Gifts.model.entity.Product;
import com.querydsl.core.BooleanBuilder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ProductRepositoryCustomImpl implements ProductRepositoryCustom{
    @PersistenceContext
    private EntityManager em;

}
