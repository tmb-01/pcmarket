package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Customer;
import uz.pdp.pcmarket.projection.CartProjection;
import uz.pdp.pcmarket.projection.CustomerProjection;

@RepositoryRestResource(path = "customer", collectionResourceRel = "list", excerptProjection = CustomerProjection.class)
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
