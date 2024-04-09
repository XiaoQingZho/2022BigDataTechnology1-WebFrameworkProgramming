package com.example.homework02.demos.web.mapper;

import com.example.homework02.demos.web.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper1 {
    @Select("select * from user;")
    List<User> getAllUsers();

    @Select("select * from user where user.id = #{id};")
    User getUserById(Integer id);

    @Insert("insert into user(username, address) values(#{username}, #{address});")
    void addUser(User users);

    @Update("update user set user.username = #{username} where user.id = #{id};")
    void updateUser(User users);

    @Delete("delete from user where user.id = #{id};")
    void deleteUser(Integer id);
}