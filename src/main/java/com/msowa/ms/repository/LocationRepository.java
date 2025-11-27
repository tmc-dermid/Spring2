package com.msowa.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.msowa.ms.model.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@RepositoryRestResource(
    collectionResourceRel = "locations",
    path = "locations"
)

public interface LocationRepository extends JpaRepository<Location, Long> {
    
    Page<Location> findByCountry(String country, Pageable pageable);

    Location findByCity(String city);
}
