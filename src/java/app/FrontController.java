package app;

import controllers.IndexController;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        try {
            req.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported Encoding Exception");
        }

        Router router = new Router();
        router.get("/zazdent/", new IndexController(), "index");

        String requestURI = req.getRequestURI();
        router.doRoute(requestURI, req, res);
    }

    
    @Override
    public String getServletInfo() {
        return "App Front Controller";
    }

}
