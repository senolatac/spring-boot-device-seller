package com.sha.springbootdeviceseller.repository.projection;

import com.sha.springbootdeviceseller.model.DeviceType;

import java.time.LocalDateTime;

/**
 * @author sa
 * @date 18.09.2021
 * @time 18:11
 */
public interface PurchaseItem
{
    String getName();
    DeviceType getType();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();
}
