package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Cart;

@Projection(types = Cart.class)
public interface CartProjection {
    Long getId();

    int getQuantity();

    ProductProjection getProduct();

    CustomerProjection getCustomer();
}
