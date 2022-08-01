package never.doTest.servelet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年08月01日 15:11
 */
public class ServeletContextDemo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        String contextPath = servletContext.getContextPath();
        System.out.println("contextPath:"+contextPath);
        String filter = servletContext.getInitParameter("filter");
        System.out.println("filter:"+filter);
        ServletConfig servletConfig = this.getServletConfig();
        Enumeration initParameterNames = servletConfig.getInitParameterNames();
        System.out.println("-----------------");
        while(initParameterNames.hasMoreElements()){
            System.out.println(initParameterNames.nextElement());
        }
        HttpSession session = req.getSession();
        Cookie[] cookies = req.getCookies();
        Cookie cookie = new Cookie("KEY","VALUE");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
