package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Characteristic;
import uz.pdp.pcmarket.projection.CharacteristicProjection;

@RepositoryRestResource(path = "characteristic", collectionResourceRel = "list", excerptProjection = CharacteristicProjection.class)
public interface CharacteristicRepository extends JpaRepository<Characteristic, Long> {
}
