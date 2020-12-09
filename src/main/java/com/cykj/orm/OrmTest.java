package com.cykj.orm;


import com.cykj.bean.User;
import com.cykj.bean.classes;
import com.cykj.bean.student;
import com.cykj.mapper.FindStudentMapper;
import com.cykj.mapper.UserMapper;
import com.cykj.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class OrmTest {

    public static void main(String[] args) {

//        User user = new User();
//        user.setUserName("peter");
//        user.setAccount("137931906");
//        user.setPwd("123456");
//        List list = new ArrayList();
//        list.add(1);
//        list.add(2);
        SqlSession session = MybatisUtil.getInstance().getSqlSession();
        FindStudentMapper findStudentMapper = session.getMapper(FindStudentMapper.class);
//        RowBounds rb = new RowBounds(1,4);
        List<student> studentList = findStudentMapper.findStudentByJoin2();
        session.commit();
        session.close();


        //把配置文件读取到IO流
        //增
//        try {
//            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//            SqlSessionFactory sessionFactory =  new SqlSessionFactoryBuilder().build(reader);
//            SqlSession session = sessionFactory.openSession(false);
//            UserMapper userMapper = session.getMapper(UserMapper.class);
//            User user = new User();
//            user.setUserName("peter");
//            user.setAccount("137931906");
//            user.setPwd("123456");
//            userMapper.addUser(user);
//            session.commit();
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //删
//        try {
//            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//            SqlSessionFactory sessionFactory =  new SqlSessionFactoryBuilder().build(reader);
//            SqlSession session = sessionFactory.openSession(false);
//            UserMapper userMapper = session.getMapper(UserMapper.class);
//            User user = new User();
//            user.getUserId(0);
//            userMapper.deleteUserById(user);
//            session.commit();
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //改
//        try {
//            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//            SqlSessionFactory sessionFactory =  new SqlSessionFactoryBuilder().build(reader);
//            SqlSession session = sessionFactory.openSession(false);
//            UserMapper userMapper = session.getMapper(UserMapper.class);
//            User user = new User();
//            user.setUserId(2);
//            user.setUserName("二狗");
//            user.setAccount("123456");
//            user.setPwd("654321");
//            userMapper.updateUser(user);
//            session.commit();
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //查
//        try {
//            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//            SqlSessionFactory sessionFactory =  new SqlSessionFactoryBuilder().build(reader);
//            SqlSession session = sessionFactory.openSession(false);
//            UserMapper userMapper = session.getMapper(UserMapper.class);
//            User user = new User();
//            user.setUserId(2);
//            user.setUserName("二狗");
//            user.setAccount("123456");
//            user.setPwd("654321");
//            userMapper.findAll();
//            session.commit();
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        User user = new User();
//        user.setUserName("pite");
//        user.setAccount("123456");
//        user.setPwd("123456");
//        Element root =  MappingUtils.fetchXml();
//        Element foo;
//        for (Iterator i = root.elementIterator("table");i.hasNext();){
//            foo = (Element) i.next();
//            String sql = MappingUtils.fetchInsertSql(foo.attributeValue("name"));
//            System.out.println(sql);
//        }

//        Admin admin = new Admin();
//        admin.setAdminName("pite");
//        Admin admin1 = (Admin)Copy.copy(admin);
//        System.out.println(admin1.getAdminName());

        //复制
//        User user = new User();
//        user.setUserName("sss");
//        User user1 = (User)Copy.copy(user);
//        System.out.println(user1.getUserName());


//        try {
//            //使用Class类的静态方法
//            Class myclass = Class.forName("com.cykj.bean.User");
//            //使用Class.类名
//            Class myclazz = User.class;
//            //new 使用getClass方法
//            User user = new User();
//            user.getClass();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        //通过Constructor对象来获取类对象
//        Class<User> myclass = User.class;
//        try {
//            Constructor<User> cons = myclass.getConstructor(String.class);
//            try {
//                User user = cons.newInstance("rousi");
//                System.out.println(user.getUserName());
//            } catch (InstantiationException e) {
//                e.printStackTrace();
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                e.printStackTrace();
//            }
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        }

        //在运行当中构造任意一个类的对象
//        Class<User> myclass = User.class;
//        try {
        //实例化对象
//            User user = myclass.newInstance();
        //通过反射机制获取方法属性
//            Method[] methods = myclass.getMethods();//获取所有
//            Method[] methods = myclass.getDeclaredMethods();//获取自己声明的
        //遍历
//            for (Method method: methods){
//                System.out.println(method.getName());
//            }
        //获取到一个指定的方法然后执行
//            Method method = myclass.getMethod("userName",String.class);
//            method.invoke(user,"pite");
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
    }

}

//    }
//}
