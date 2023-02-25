package org.tango.mapper;

import org.tango.po.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailMapper {

    int saveOrderDetailBatch(List<OrderDetail> list);

    List<OrderDetail> listOrderDetailByOrderId(Integer orderId);
}
