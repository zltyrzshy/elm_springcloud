package org.tango.po;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter//自动加getter方法
@Setter//自动加setter方法
@AllArgsConstructor//所有字段的构造函数
@NoArgsConstructor//无参构造
public class Business {

    private Integer businessId;
    private String businessName;
    private String businessAddress;
    private String businessExplain;
    private String businessImg;
    private Integer orderTypeId;
    private double starPrice; //起送费
    private double deliveryPrice; //配送费
    private String remarks;

    private List<Food> foodList;


    @Override
    public String toString() {
        return
                "businessId='" + businessId + '\'' +
                        ", businessName='" + businessName + '\'' +
                        ", businessAddress='" + businessAddress + '\'' +
                        ", businessExplain='" + businessExplain + '\'' +
                        ", businessImg" +
                        ", orderTypeId=" + orderTypeId +
                        ", starPrice=" + starPrice +
                        ", deliveryPrice=" + deliveryPrice +
                        ", remarks='" + remarks + '\'';
    }

}