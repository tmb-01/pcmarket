package uz.pdp.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.pcmarket.entity.Attachment;
import uz.pdp.pcmarket.entity.Characteristic;
import uz.pdp.pcmarket.entity.Product;

import java.util.List;

@Projection(types = Product.class)
public interface ProductProjection {
    Long getId();

    String getName();

    String getShortInfo();

    int getPrice();

    String getDetailedInfo();

    int getGuarantee();

    boolean getAvailable();

    CategoryProjection getCategory();

    Attachment getAttachment();

//    List<Characteristic> getCharacteristic();
}
