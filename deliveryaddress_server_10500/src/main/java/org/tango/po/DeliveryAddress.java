package org.tango.po;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeliveryAddress {

    private Integer daId;
    private String contactName;
    private Integer contactSex;
    private String contactTel;
    private String address;
    private String userId;


}
