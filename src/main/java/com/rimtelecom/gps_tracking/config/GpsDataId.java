package com.rimtelecom.gps_tracking.config;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class GpsDataId implements Serializable {

    private LocalDateTime date;
    private int idDevice;

    // Constructor with parameters
    public GpsDataId(LocalDateTime date, int idDevice) {
        this.date = date;
        this.idDevice = idDevice;
    }
}