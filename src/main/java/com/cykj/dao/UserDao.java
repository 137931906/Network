package com.cykj.dao;

import com.cykj.bean.User;
import com.cykj.mapper.UserMapper;
import com.cykj.util.MybatisUtil;
import com.cykj.util.ObjectFactory;
import org.apache.ibatis.session.SqlSession;


public class UserDao {

    User user = (User) ObjectFactory.newInstance("com.cykj.bean.User");
    //用户登入
    public User login(String account, String pwd) {
        SqlSession session = MybatisUtil.getInstance().getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        user.setAccount(account);
        user.setPwd(pwd);
        User user1 = userMapper.findAll(user);
        session.commit();
//        session.close();
        return user1;
    }

    //用户注册
    public int addUser(String account, String pwd,String sex,String education,String profession,int phone,String email) {
        SqlSession session = MybatisUtil.getInstance().getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
//        user.setUserId(7);
        user.setUserName("");
        user.setAccount(account);
        user.setPwd(pwd);
        user.setSex(sex);
        user.setEducation(education);
        user.setProfession(profession);
        user.setPhone(phone);
        user.setEmail(email);
        int user1 = userMapper.addUser(user);
        session.commit();
//        session.close();
        return user1;
    }
}
