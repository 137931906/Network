package com.cykj.mapper;

import com.cykj.bean.FindUser;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface FindUserMapper {

    List<FindUser> findUser(RowBounds rb);
    int userCount();
}
