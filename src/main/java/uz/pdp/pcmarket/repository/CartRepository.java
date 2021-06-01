package uz.pdp.pcmarket.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.pcmarket.entity.Cart;
import uz.pdp.pcmarket.projection.CartProjection;

import java.util.List;

@RepositoryRestResource(path = "cart", collectionResourceRel = "list", excerptProjection = CartProjection.class)
public interface CartRepository extends JpaRepository<Cart, Long> {

    @RestResource(path = "user")
    Page<Cart> findByCustomer_Id(@Param("customer_id") Long customer_id, Pageable pageable);

}
