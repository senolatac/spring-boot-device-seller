package com.sha.springbootdeviceseller.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author sa
 * @date 18.09.2021
 * @time 17:49
 */
@Data
@Entity
@Table(name = "devices")
public class Device
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", nullable = false, length = 1000)
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "device_type", nullable = false)
    private DeviceType deviceType;

    //@OneToMany(fetch = FetchType.LAZY, mappedBy = "device")
    //private Set<Purchase> purchaseList;
}
