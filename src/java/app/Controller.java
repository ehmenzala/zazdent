package app;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller {
    /**
     * @param file is relative to <code>/WEB-INF/views/</code> folder.
     * @param req the request.
     * @param res the response.
     */
    protected static void view(String file, HttpServletRequest req, HttpServletResponse res) {
        RequestDispatcher dispatcher=req.getRequestDispatcher("/WEB-INF/views/"+file);
        
        try {  
            dispatcher.forward(req, res);
        } catch (ServletException ex) {
             System.out.println("ServletException");
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }
}
