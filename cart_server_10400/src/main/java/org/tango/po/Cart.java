package org.tango.po;

import lombok.*;

@Setter
@Getter
//@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    protected Integer cartId;
    protected Integer foodId;
    protected Integer businessId;
    protected String userId;
    protected Integer quantity;
    protected Food food;
    protected Business business;

}