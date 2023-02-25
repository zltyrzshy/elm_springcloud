package org.tango.po;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter//自动加getter方法
@Setter//自动加setter方法
@AllArgsConstructor//所有字段的构造函数
@NoArgsConstructor//无参构造
public class Food {

    private Integer foodId;
    private String foodName;
    private String foodExplain;
    private String foodImg;
    private Double foodPrice;
    private Integer businessId;
    private String remarks;

    @Override
    public String toString() {
        return "foodId: " + foodId
                + ", foodName: " + foodName
                + ", foodExplain: " + foodExplain
                + ", foodImg: "
                + ", foodPrice: " + foodPrice
                + ", businessId: " + businessId
                + ", remarks: " + remarks;
    }

}