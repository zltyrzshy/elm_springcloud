package org.tango.mapper;

import org.tango.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where userId=#{userId} and password=#{password}")
    User getUserByIdByPass(@Param("userId") String userId, @Param("password") String password);

    @Select("select count(*) from user where userId=#{userId}")
    Integer getUserById(@Param("userId") String userId);

    @Insert("insert into user values(#{userId},#{password},#{userName},#{userSex},null)")
    Integer saveUser(@Param("userId") String userId, @Param("password") String password, @Param("userName") String userName, @Param("userSex") int userSex);
}
