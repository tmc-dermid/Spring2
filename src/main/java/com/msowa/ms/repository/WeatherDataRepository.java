package com.msowa.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.msowa.ms.model.WeatherData;
import com.msowa.ms.model.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.time.LocalDateTime;

@RepositoryRestResource(
    collectionResourceRel = "weatherData",
    path = "weatherData"
)

public interface WeatherDataRepository extends JpaRepository<WeatherData, Long> {

    Page<WeatherData> findByTimestampGreaterThanEqualAndLocation(
        LocalDateTime timestamp,
        Location location,
        Pageable pageable
    );
}
