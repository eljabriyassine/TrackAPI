package com.rimtelecom.gps_tracking.entities;

import com.rimtelecom.gps_tracking.config.GpsDataId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "arch_1004901")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(GpsDataId.class)
public class GpsData {

    @Id
    @Column(name = "date")
    private LocalDateTime date;

    @Id
    @Column(name = "id_device")
    private int idDevice;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;
//
//    @Column(name = "speed")
//    private int speed;
//
//    @Column(name = "heading")
//    private int heading;

    // Optional fields for tooltip info
//    @Column(name = "fuel")
//    private int fuel;
//
//    @Column(name = "odo")
//    private double odo;
//
//    @Column(name = "temp")
//    private String temp;
}
