package com.cykj.servlet;

import com.cykj.bean.User;
import com.cykj.dao.UserDao;
import com.cykj.util.ObjectFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    UserDao userDao = (UserDao) ObjectFactory.newInstance("com.cykj.dao.UserDao");

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String account = req.getParameter("account");
        String pwd = req.getParameter("pwd");
        String vCode = req.getParameter("vCode");
        String vCodeServer = (String) req.getSession().getAttribute("vCode");
        System.out.println(account + "====" + pwd + "====" + vCode);
        req.getSession().removeAttribute("verifyImg");
        User user=userDao.login(account,pwd);
        if (vCode.equalsIgnoreCase(vCodeServer)) {
            if (user != null) {
                req.getSession().setAttribute("user", user);
                resp.getWriter().write("登入成功");
            } else {
                resp.getWriter().write("登入失败");
            }
        }else{
            resp.getWriter().write("验证码输入错误");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}

