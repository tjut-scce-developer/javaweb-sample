package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import commn.PageMsg;
import dao.UsertableDao;
import po.UsertablePO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Created by AT on 2018/4/5.
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();
        PageMsg pageMsg =new PageMsg();
        ObjectMapper objectMapper = new ObjectMapper();

        //获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UsertableDao usertableDao = new UsertableDao();
        try {
            UsertablePO usertablePO = usertableDao.seletcByUsername(username);
            if(password.equals(usertablePO.getPassword())){
                session.setAttribute("username", username);
                session.setAttribute("userInfo", usertablePO);
                pageMsg.setPageMessage("200");
                pageMsg.setPagePath("page.jsp");
                out.print(objectMapper.writeValueAsString(pageMsg));
            }else {
                pageMsg.setPagePath("login.jsp");
                pageMsg.setPageMessage("登录失败！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
