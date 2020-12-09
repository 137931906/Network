package com.cykj.dao;

import com.cykj.bean.FindUser;
import com.cykj.mapper.FindUserMapper;
import com.cykj.util.MybatisUtil;
import com.cykj.util.ObjectFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class FindUserDao {

    FindUser findUser = (FindUser)ObjectFactory.newInstance("com.cykj.bean.FindUser");

    public List<FindUser> findUserList(RowBounds rb){
        SqlSession session = MybatisUtil.getInstance().getSqlSession();
        FindUserMapper findUserMapper = session.getMapper(FindUserMapper.class);
        List<FindUser> findUserList = findUserMapper.findUser(rb);
        return findUserList;
    }


    public int userCount(){
        SqlSession sqlSession= MybatisUtil.getInstance().getSqlSession();
        FindUserMapper findUserMapper=sqlSession.getMapper(FindUserMapper.class);
        int countUser=findUserMapper.userCount();
        return countUser;
    }




}
