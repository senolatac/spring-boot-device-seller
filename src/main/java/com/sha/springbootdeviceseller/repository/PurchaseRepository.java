package com.sha.springbootdeviceseller.repository;

import com.sha.springbootdeviceseller.model.Purchase;
import com.sha.springbootdeviceseller.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author sa
 * @date 18.09.2021
 * @time 18:10
 */
public interface PurchaseRepository extends JpaRepository<Purchase, Long>
{
    @Query("select " +
            "d.name as name, d.deviceType as type, p.price as price, p.color as color, p.purchaseTime as purchaseTime " +
            "from Purchase p left join Device d on d.id = p.deviceId " +
            "where p.userId = :userId")
    List<PurchaseItem> findAllPurchasesOfUser(@Param("userId") Long userId);
}
