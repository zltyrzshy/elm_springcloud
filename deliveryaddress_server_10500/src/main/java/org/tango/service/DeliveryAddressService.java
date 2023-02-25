package org.tango.service;


import org.tango.po.DeliveryAddress;

import java.util.List;

public interface DeliveryAddressService {
    List<DeliveryAddress> listDeliveryAddressByUserId(String userId);

    DeliveryAddress getDeliveryAddressById(Integer daId);

    int saveDeliveryAddress(String contactName, Integer contactSex, String contactTel, String address, String userId);

    int updateDeliveryAddress(Integer daId, String contactName, Integer contactSex, String contactTel, String address);

    int removeDeliveryAddress(Integer daId);
}
