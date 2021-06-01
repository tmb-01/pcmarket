package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Product;
import uz.pdp.pcmarket.projection.CartProjection;
import uz.pdp.pcmarket.projection.ProductProjection;

@RepositoryRestResource(path = "product", collectionResourceRel = "list", excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Long> {
}
