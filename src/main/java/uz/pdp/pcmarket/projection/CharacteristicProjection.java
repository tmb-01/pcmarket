package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Cart;
import uz.pdp.pcmarket.entity.Characteristic;
import uz.pdp.pcmarket.entity.Product;
import uz.pdp.pcmarket.entity.Property;

import javax.persistence.ManyToOne;
import java.util.List;

@Projection(types = Characteristic.class)
public interface CharacteristicProjection {
    Long getId();

    Product getProduct();

//    List<Property> getProperties();
}
