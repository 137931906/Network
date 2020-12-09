package com.cykj.mapper;

import com.cykj.bean.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface UserMapper {

    int addUser(User user);
    void deleteUserById(User user);
    void updateUser(User user);
    User findAll(User user);
    List<User> findAll2(RowBounds rb);
    List<User> findIn(List list);


}
