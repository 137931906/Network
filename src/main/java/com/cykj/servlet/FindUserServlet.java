package com.cykj.servlet;

import com.alibaba.fastjson.JSON;
import com.cykj.bean.FindUser;
import com.cykj.dao.FindUserDao;
import com.cykj.mapper.FindUserMapper;
import com.cykj.util.ObjectFactory;
import org.apache.ibatis.session.RowBounds;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {

    FindUserDao findUserDao = (FindUserDao)ObjectFactory.newInstance("com.cykj.dao.FindUserDao");

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String page=req.getParameter("page");
        int newPage=Integer.parseInt(page);
        String limit=req.getParameter("limit");
        int newLimit=Integer.parseInt(limit);
        RowBounds rb=new RowBounds((newPage-1)*newLimit,newLimit);
        Map<String,Object> map = new HashMap<>();
        List<FindUser> findUserList = findUserDao.findUserList(rb);
        map.put("code",0);
        map.put("msg","");
        map.put("count",findUserDao.userCount());
        map.put("data",findUserList);
        resp.getWriter().write(JSON.toJSONString(map));


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

}
