package com.dingdatech.renting.application.pilelock;

/**
 * 开锁命令
 * <p>
 * Created by zzp on 7/28/16.
 */
public class UnlockCommand {

    private String customerId;
    private String pileLockId;
    private String stationId;
    private String districtId;

    public UnlockCommand(String customerId, String pileLockId, String stationId, String districtId) {
        this.customerId = customerId;
        this.pileLockId = pileLockId;
        this.stationId = stationId;
        this.districtId = districtId;
    }

    public UnlockCommand() {
        super();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPileLockId() {
        return pileLockId;
    }

    public void setPileLockId(String pileLockId) {
        this.pileLockId = pileLockId;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }
}
