package com.dingdatech.renting.domain.module.district;

import com.dingdatech.renting.domain.module.Entity;

/**
 * 区域实体。<br>
 * 区域是若干网点的一个集合, 一个城市可能有一个或多个区域。
 * <p>
 * Created by zzp on 7/28/16.
 */
public class District extends Entity {

    private DepositPlan depositPlan;

    private BillingPlan billingPlan;

    private FreeTimePlan freeTimePlan;

}
