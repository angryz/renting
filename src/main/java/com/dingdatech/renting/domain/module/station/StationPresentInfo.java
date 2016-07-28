package com.dingdatech.renting.domain.module.station;

/**
 * 网点当前实时信息,包括可租数和可还数。
 * <p>
 * Created by zzp on 7/28/16.
 */
public class StationPresentInfo {

    private final int rantableTotal;

    private final int returnableTotal;

    public StationPresentInfo(int rantableTotal, int returnableTotal) {
        this.rantableTotal = rantableTotal;
        this.returnableTotal = returnableTotal;
    }

    public int getRantableTotal() {
        return rantableTotal;
    }

    public int getReturnableTotal() {
        return returnableTotal;
    }
}
