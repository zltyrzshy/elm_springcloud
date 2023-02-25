package org.tango.service.impl;

import org.tango.mapper.DeliveryAddressMapper;
import org.tango.po.DeliveryAddress;
import org.tango.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class DeliveryAddressServiceImpl implements DeliveryAddressService {

    @Autowired
    private DeliveryAddressMapper dAM;


    @Override
    public List<DeliveryAddress> listDeliveryAddressByUserId(String userId) {
        return dAM.listDeliveryAddressByUserId(userId);
    }

    @Override
    public DeliveryAddress getDeliveryAddressById(Integer daId) {
        return dAM.getDeliveryAddressById(daId);
    }

    @Override
    @Transactional
    public int saveDeliveryAddress(String contactName, Integer contactSex, String contactTel, String address, String userId) {

        return dAM.saveDeliveryAddress(contactName, contactSex, contactTel, address, userId);
    }

    @Override
    public int updateDeliveryAddress(Integer daId, String contactName, Integer contactSex, String contactTel, String address) {
        return dAM.updateDeliveryAddress(daId, contactName, contactSex, contactTel, address);
    }

    @Override
    public int removeDeliveryAddress(Integer daId) {
        return dAM.removeDeliveryAddress(daId);
    }


}
