package org.tango.po;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T result;


}
