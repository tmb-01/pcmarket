package uz.pdp.pcmarket.projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Cart;
import uz.pdp.pcmarket.entity.Customer;
import uz.pdp.pcmarket.entity.Order;

import javax.persistence.*;


@Projection(types = Order.class)
public interface OrderProjection {
    Long getId();

    String getFullName();

    String getAddress();

    String getPhoneNumber();

    String getEmail();

    Customer getCustomer();

    Cart getCart();
}
