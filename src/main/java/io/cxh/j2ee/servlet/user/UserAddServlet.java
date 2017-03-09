package io.cxh.j2ee.servlet.user;

import io.cxh.j2ee.service.UserService;
import io.cxh.j2ee.utils.ServletUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/3/9.
 */
public class UserAddServlet extends HttpServlet {

    /**
     * 显示添加表单
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("/jsp/user/add.jsp").forward(req, resp);
    }


    /**
     * 接收添加请求
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        try {
            req.setCharacterEncoding("utf-8");
            String name = ServletUtil.paramsClean(req.getParameter("username"));
            String birthdayStr = ServletUtil.paramsClean(req.getParameter("birthday"));
            Date birthday = birthdayStr == null ? null : new SimpleDateFormat("yyyy-MM-dd").parse(birthdayStr);
            String sex = ServletUtil.paramsClean(req.getParameter("sex"));
            String address = ServletUtil.paramsClean(req.getParameter("address"));
            String scoreStr = ServletUtil.paramsClean(req.getParameter("englishScore"));
            Integer score = scoreStr == null ? null : Integer.parseInt(scoreStr);

            new UserService().addUser(name, birthday, sex, address, score);

            resp.sendRedirect("/users");

        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect("/users/add");

        }
    }

}
