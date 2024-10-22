package com.rimtelecom.gps_tracking.services;

import com.rimtelecom.gps_tracking.entities.GpsData;

import java.time.LocalDateTime;
import java.util.List;

public interface GpsDataService {
    List<GpsData> getAllGpsData();
}
