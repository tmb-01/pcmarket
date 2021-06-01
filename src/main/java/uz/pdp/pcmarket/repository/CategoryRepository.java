package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Category;
import uz.pdp.pcmarket.projection.CartProjection;
import uz.pdp.pcmarket.projection.CategoryProjection;

@RepositoryRestResource(path = "category", collectionResourceRel = "list", excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
