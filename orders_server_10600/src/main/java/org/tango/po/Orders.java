package org.tango.po;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Orders {


    private String userId;
    private Integer businessId;
    private Integer daId; //送货地址编号
    private Integer orderState; //订单状态（0：未支付； 1：已支付）
    private Integer orderId;
    private String orderDate;
    private Double orderTotal;


    public Orders(String userId, Integer businessId, Integer daId, double orderTotal, String currentDate) {
        this.userId = userId;
        this.businessId = businessId;
        this.daId = daId;
        this.orderTotal = orderTotal;
        this.orderDate = currentDate;
    }
}