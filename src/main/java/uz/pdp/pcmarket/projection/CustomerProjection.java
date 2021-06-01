package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Customer;

@Projection(types = Customer.class)
public interface CustomerProjection {
    Long getId();

    String getFirstName();

    String getLastName();
}
