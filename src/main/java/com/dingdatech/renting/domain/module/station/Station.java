package com.dingdatech.renting.domain.module.station;

import com.dingdatech.renting.domain.module.Entity;

/**
 * 网点。<br>
 * 网点是多个自行车蹲位的集合, 一个网点只属于一个区域。
 * <p>
 * Created by zzp on 7/28/16.
 */
public class Station extends Entity {

    private StationLocation location;
}
