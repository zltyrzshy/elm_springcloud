package org.tango.po;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrderDetail {

    private Integer odId;
    private Integer orderId;
    private Integer foodId;
    private Integer quantity;

}
