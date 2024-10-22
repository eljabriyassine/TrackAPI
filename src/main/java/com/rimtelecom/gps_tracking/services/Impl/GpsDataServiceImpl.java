package com.rimtelecom.gps_tracking.services.Impl;

import com.rimtelecom.gps_tracking.entities.GpsData;
import com.rimtelecom.gps_tracking.repository.GpsDataRepository;
import com.rimtelecom.gps_tracking.services.GpsDataService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class GpsDataServiceImpl  implements GpsDataService {

    private GpsDataRepository gpsDataRepository;

    public GpsDataServiceImpl(GpsDataRepository gpsDataRepository) {
        this.gpsDataRepository = gpsDataRepository;
    }

    @Override
    public List<GpsData> getAllGpsData() {
        return gpsDataRepository.findAll();
    }
}
