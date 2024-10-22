package com.rimtelecom.gps_tracking.repository;

import com.rimtelecom.gps_tracking.config.GpsDataId;
import com.rimtelecom.gps_tracking.entities.GpsData;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GpsDataRepository extends JpaRepository<GpsData, GpsDataId> {

}
