package com.sha.springbootdeviceseller.service;

import com.sha.springbootdeviceseller.model.Device;
import com.sha.springbootdeviceseller.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author sa
 * @date 19.09.2021
 * @time 15:27
 */
@Service
public class DeviceServiceImpl implements DeviceService
{
    private final DeviceRepository deviceRepository;

    public DeviceServiceImpl(DeviceRepository deviceRepository)
    {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public Device saveDevice(Device device)
    {
        device.setCreateTime(LocalDateTime.now());

        return deviceRepository.save(device);
    }

    @Override
    public void deleteDevice(Long id)
    {
        deviceRepository.deleteById(id);
    }

    @Override
    public List<Device> findAllDevices()
    {
        return deviceRepository.findAll();
    }
}
