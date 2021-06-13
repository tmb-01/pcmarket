package uz.pdp.pcmarket.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.pcmarket.entity.Property;
import uz.pdp.pcmarket.projection.PropertyProjection;

import java.util.Collection;
import java.util.List;

@RepositoryRestResource(path = "property", collectionResourceRel = "list", excerptProjection = PropertyProjection.class)
public interface PropertyRepository extends JpaRepository<Property, Long> {

    List<Property> findAllByIdIn(List<Long> id);

//    @RestResource(path = "byProperty")
//    Page<Property> findAllByPropertyNameAndPropertyValue(String propertyName, String propertyValue, Pageable pageable);

//    @RestResource(path = "filter")
//    @Query(value = "select * from properties", nativeQuery = true)
//    Page<Property> findByFilter();


}
