package uz.pdp.pcmarket.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.pcmarket.entity.Product;
import uz.pdp.pcmarket.entity.Property;
import uz.pdp.pcmarket.projection.ProductProjection;

@RepositoryRestResource(path = "product", collectionResourceRel = "list", excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Long> {

    @RestResource(path = "price-between")
    Page<Product> findAllByPriceBetween(int price, int price2, Pageable pageable);

}