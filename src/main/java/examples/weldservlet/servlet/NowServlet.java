package examples.weldservlet.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import examples.weldservlet.bean.DateTimeFormatBean;

@WebServlet("/NowServlet")
public class NowServlet extends HttpServlet {

    @Inject
    private DateTimeFormatBean dateTimeFormatBean;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append(dateTimeFormatBean.get());
    }

}
