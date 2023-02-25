package org.tango.service.impl;


import org.tango.mapper.BusinessMapper;
import org.tango.po.Business;
import org.tango.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessMapper bM;


    @Override
    public List<Business> listBusiness() {
        return bM.listBusiness();
    }

    @Override
    public List<Business> listRandomBusiness() {
        return listRandom((listBusiness()), 10);
    }

    @Override
    public List<Business> listBusinessByOrderTypeId(Integer orderTypeId) {
        return bM.listBusinessByOrderTypeId(orderTypeId);
    }

    @Override
    public Business getBusinessById(Integer businessId) {
        return bM.getBusinessById(businessId);
    }


    private List<Business> listRandom(List<Business> list, int num) {//从一个list中随机获取num个
        if (list.size() <= num) {
            return list;
        }

        Random r = new Random();
        Set<Business> res = new HashSet<>();
        while (res.size() < num) {
            res.add(
                    list.get(
                            r.nextInt(
                                    list.size())));
        }
        return new ArrayList<>(res);
    }


}
