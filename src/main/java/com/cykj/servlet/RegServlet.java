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

@WebServlet("/regServlet")
public class RegServlet extends HttpServlet {


    UserDao userDao = (UserDao) ObjectFactory.newInstance("com.cykj.dao.UserDao");

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account = req.getParameter("account");
        String pwd = req.getParameter("pwd");
        String confirmPwd = req.getParameter("confirmPwd");
        String sex = req.getParameter("sex");
        String education = req.getParameter("education");
        String profession = req.getParameter("profession");
        String phone = req.getParameter("phone");
//        int newPhone=Integer.parseInt(phone);
        String email = req.getParameter("email");
        System.out.println(account + "====" + pwd + "====" + confirmPwd + "====" + sex + "====" + education + "====" + profession + "====" + phone + "====" + email);
        int user = userDao.addUser(account,pwd,sex,education,profession,Integer.parseInt(phone),email);
        if (user >0) {
            req.getSession().setAttribute("user", user);
            resp.getWriter().write("注册成功");
        } else {
            resp.getWriter().write("注册失败");
        }
//        req.setAttribute("account",account);
////        req.setAttribute("pwd",pwd);
////        req.setAttribute("confirmPwd",confirmPwd);
////        req.setAttribute("sex",sex);
////        req.setAttribute("education",education);
////        req.setAttribute("profession",profession);
////        req.setAttribute("phone",phone);
////        req.setAttribute("email",email);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

}
