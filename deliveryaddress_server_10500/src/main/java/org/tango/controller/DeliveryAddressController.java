package org.tango.controller;

import org.tango.po.CommonResult;
import org.tango.po.DeliveryAddress;
import org.tango.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/DeliveryAddressController")
public class DeliveryAddressController {
    @Autowired
    private DeliveryAddressService dAS;

    @GetMapping("/listDeliveryAddressByUserId/{userId}")
    public CommonResult<List<DeliveryAddress>> listDeliveryAddressByUserId(@PathVariable("userId") String userId) {
        List<DeliveryAddress> list = dAS.listDeliveryAddressByUserId(userId);
        return new CommonResult<>(200, "success", list);
    }

    @GetMapping("/getDeliveryAddressById/{daId}")
    public CommonResult<DeliveryAddress> getDeliveryAddressById(@PathVariable("daId") Integer
                                                                        daId) {
        return new CommonResult<>(200, "success", dAS.getDeliveryAddressById(daId));
    }

    @PostMapping("/saveDeliveryAddress/{contactName}/{contactSex}/{contactTel}/{address}/{userId}")
    public CommonResult<Integer> saveDeliveryAddress(
            @PathVariable("contactName") String contactName,
            @PathVariable("contactSex") Integer contactSex,
            @PathVariable("contactTel") String contactTel,
            @PathVariable("address") String address,
            @PathVariable("userId") String userId) {

        return new CommonResult<>(200, "success", dAS.saveDeliveryAddress(contactName, contactSex, contactTel, address, userId));
    }

    @PutMapping("/updateDeliveryAddress/{daId}/{contactName}/{contactSex}/{contactTel}/{address}")
    public CommonResult<Integer> updateDeliveryAddress(
            @PathVariable("daId") Integer daId,
            @PathVariable("contactName") String contactName,
            @PathVariable("contactSex") Integer contactSex,
            @PathVariable("contactTel") String contactTel,
            @PathVariable("address") String address) {

        return new CommonResult<>(200, "success", dAS.updateDeliveryAddress(daId, contactName, contactSex, contactTel, address));
    }

    @DeleteMapping("/removeDeliveryAddress/{daId}")
    public CommonResult<Integer> removeDeliveryAddress(@PathVariable("daId") Integer daId) {
        return new CommonResult<>(200, "success", dAS.removeDeliveryAddress(daId));
    }
}
