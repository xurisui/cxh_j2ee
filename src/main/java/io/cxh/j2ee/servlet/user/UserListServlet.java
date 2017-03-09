package io.cxh.j2ee.servlet.user;


import io.cxh.j2ee.model.User;
import io.cxh.j2ee.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/3/9.
 */
public class UserListServlet extends HttpServlet {


    /**
     * 列出所有用户概要信息
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        try {
            List<User> users = new UserService().getAllUsers();
            req.setAttribute("users", users);

        } catch (Exception e) {
            e.printStackTrace();
        }



        req.getRequestDispatcher("/jsp/user/list.jsp").forward(req, resp);
    }
}
