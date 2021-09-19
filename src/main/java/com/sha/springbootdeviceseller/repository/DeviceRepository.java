package com.sha.springbootdeviceseller.repository;

import com.sha.springbootdeviceseller.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sa
 * @date 18.09.2021
 * @time 18:08
 */
public interface DeviceRepository extends JpaRepository<Device, Long>
{
}
