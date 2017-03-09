package io.cxh.j2ee.servlet.user;

import io.cxh.j2ee.model.User;
import io.cxh.j2ee.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/3/9.
 */
public class UserDetailServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int userId = Integer.parseInt(req.getParameter("id"));
            User user = new UserService().getUserById(userId);
            req.setAttribute("user", user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/jsp/user/detail.jsp").forward(req,resp);
    }
}
