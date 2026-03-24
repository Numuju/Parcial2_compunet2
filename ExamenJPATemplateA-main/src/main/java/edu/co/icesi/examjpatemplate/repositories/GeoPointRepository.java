package edu.co.icesi.examjpatemplate.repositories;

import edu.co.icesi.examjpatemplate.model.GeoPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GeoPointRepository extends JpaRepository<GeoPoint, Integer> {

    List<GeoPoint> findByBusLicensePlateOrderByTimestamp(String licensePlate);

    GeoPoint findFirstByBusLicensePlateOrderByTimestampDesc(String licensePlate);
}
