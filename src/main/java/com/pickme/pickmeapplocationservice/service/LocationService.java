package com.pickme.pickmeapplocationservice.service;

import com.pickme.pickmeapplocationservice.dto.DriverLocationDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LocationService {

    Boolean saveDriverLocation(String driverId, Double latitude, Double Longitude);

    List<DriverLocationDto> getNearByDrivers(Double latitude, Double Longitude);

}
