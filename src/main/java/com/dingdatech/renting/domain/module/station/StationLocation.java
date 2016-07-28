package com.dingdatech.renting.domain.module.station;

import com.dingdatech.renting.domain.module.ValueObject;

/**
 * 网点地理位置
 * <p>
 * Created by zzp on 7/28/16.
 */
public class StationLocation extends ValueObject {

    private final Double longitude;

    private final Double latitude;

    public StationLocation(Double longitude, Double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }
}
