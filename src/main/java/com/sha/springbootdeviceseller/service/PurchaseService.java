package com.sha.springbootdeviceseller.service;

import com.sha.springbootdeviceseller.model.Purchase;
import com.sha.springbootdeviceseller.repository.projection.PurchaseItem;

import java.util.List;

/**
 * @author sa
 * @date 19.09.2021
 * @time 15:31
 */
public interface PurchaseService
{
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemsOfUser(Long userId);
}
