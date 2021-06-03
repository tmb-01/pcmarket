package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.pcmarket.entity.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}
