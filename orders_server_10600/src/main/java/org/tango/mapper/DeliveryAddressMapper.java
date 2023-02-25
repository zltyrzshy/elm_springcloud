package org.tango.mapper;

import org.apache.ibatis.annotations.*;
import org.tango.po.DeliveryAddress;

import java.util.List;

@Mapper
public interface DeliveryAddressMapper {

    @Select("select * from delivery_address where userId=#{userId} order by daId")
    List<DeliveryAddress> listDeliveryAddressByUserId(String userId);

    @Select("select * from delivery_address where daId=#{daId}")
    DeliveryAddress getDeliveryAddressById(Integer daId);

    @Insert("insert into delivery_address values(null,#{contactName},#{contactSex},#{contactTel},#{address},#{userId})")
    int saveDeliveryAddress(@Param("contactName") String contactName,
                            @Param("contactSex") Integer contactSex,
                            @Param("contactTel") String contactTel,
                            @Param("address") String address,
                            @Param("userId") String userId);

    @Update("update delivery_address set contactName=#{contactName},contactSex=#{contactSex},contactTel=#{contactTel},address=#{address} where daId=#{daId} ")
    int updateDeliveryAddress(@Param("daId") Integer daId,
                              @Param("contactName") String contactName,
                              @Param("contactSex") Integer contactSex,
                              @Param("contactTel") String contactTel,
                              @Param("address") String address);

    @Update("delete from delivery_address where daId=#{daId}")
    int removeDeliveryAddress(Integer daId);

}