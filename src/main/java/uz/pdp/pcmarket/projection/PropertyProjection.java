package uz.pdp.pcmarket.projection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Characteristic;
import uz.pdp.pcmarket.entity.Property;

import javax.persistence.*;

@Projection(types = Property.class)
public interface PropertyProjection {
    Long getId();

    String getPropertyName();

    String getPropertyValue();

    Characteristic getCharacteristic();
}
