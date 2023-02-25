package org.tango.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.tango.po.Cart;

import java.util.List;

@Mapper
public interface CartMapper {

    List<Cart> listCart(@Param("businessId") Integer businessId, @Param("userId") String userId);//一个用户一个商家的cart

//    List<Cart> listCart(String userId);//一个用户一个商家的cart

    @Insert("insert into cart values(null,#{foodId},#{businessId},#{userId},1)")
    int saveCart(@Param("foodId") Integer foodId, @Param("businessId") Integer businessId, @Param("userId") String userId);

    @Update("update cart set quantity=#{quantity} where foodId=#{foodId} and businessId=#{businessId} and userId=#{userId}")
    int updateCart(@Param("quantity") Integer quantity, @Param("foodId") Integer foodId, @Param("businessId") Integer businessId, @Param("userId") String userId);

    int removeCart(@Param("foodId") Integer foodId, @Param("businessId") Integer businessId, @Param("userId") String userId);//删除单个食品的购物车


}