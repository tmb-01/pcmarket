package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Category;

@Projection(types = Category.class)
public interface CategoryProjection {
    Long getId();

    String getCategoryName();

    CategoryProjection getSubCategory();
}
