package org.tango.service;


import org.tango.po.Business;

import java.util.List;

public interface BusinessService {

    List<Business> listBusiness();

    List<Business> listRandomBusiness();

    List<Business> listBusinessByOrderTypeId(Integer orderTypeId);

    Business getBusinessById(Integer businessId);

}
