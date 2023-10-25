package controllers;

import app.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexController extends Controller {
    
    public void index (HttpServletRequest req, HttpServletResponse res) {
        view("index.jsp", req, res);
    }
}
