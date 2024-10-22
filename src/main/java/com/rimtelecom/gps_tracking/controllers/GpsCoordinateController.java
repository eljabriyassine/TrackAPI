package com.rimtelecom.gps_tracking.controllers;

import com.rimtelecom.gps_tracking.entities.GpsData;
import com.rimtelecom.gps_tracking.services.GpsDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/coordinates")
public class GpsCoordinateController {
    private GpsDataService gpsDataService;

    public GpsCoordinateController(GpsDataService gpsDataService) {
        this.gpsDataService = gpsDataService;
    }

    @GetMapping
    public List<GpsData> getCoordinates() {
        return gpsDataService.getAllGpsData();
    }
}