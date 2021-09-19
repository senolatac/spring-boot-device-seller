package com.sha.springbootdeviceseller.service;

import com.sha.springbootdeviceseller.model.Device;

import java.util.List;

/**
 * @author sa
 * @date 19.09.2021
 * @time 15:26
 */
public interface DeviceService
{
    Device saveDevice(Device device);

    void deleteDevice(Long id);

    List<Device> findAllDevices();
}
