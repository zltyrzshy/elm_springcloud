package org.tango.po;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class User {

    private String userId;
    private String password;
    private String userName;
    private Integer userSex;
    private String userImg;

    @Override
    public String toString() {
        return "userId: " + userId
                + ", password: " + password
                + ", userName: " + userName
                + ", userExplain: " + userSex
                + ", userImg: ";
    }

}
