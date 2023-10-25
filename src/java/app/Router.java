package app;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Router {

    private HashMap<String, RouteModel> httpGetRouteList;
    private HashMap<String, RouteModel> httpPostRouteList;
    private final HashMap<String, HashMap<String, RouteModel>> routes;

    public Router() {
        this.routes = new HashMap<>();
        this.httpGetRouteList = new HashMap<>();
        this.httpPostRouteList = new HashMap<>();
    }

    public void get(String url, Controller controller, String method) {
        httpGetRouteList.put(url, new RouteModel(controller, method));
    }

    public void post(String url, Controller controller, String method) {
        httpPostRouteList.put(url, new RouteModel(controller, method));
    }

    public void doRoute(String requestURI, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        routes.put("GET", httpGetRouteList);
        routes.put("POST", httpPostRouteList);
        String requestMethod = req.getMethod();
        
        System.out.println("Routes entry set: " + routes.entrySet());

        for (Map.Entry<String, HashMap<String, RouteModel>> httpMethod : routes.entrySet()) {
            if (httpMethod.getKey().equals(requestMethod)) {
                for (Map.Entry<String, RouteModel> route : httpMethod.getValue().entrySet()) {
                    if (route.getKey().equals(requestURI)) {
                        RouteModel routeModel = route.getValue();

                        try {
                            Method method = routeModel.getController().getClass().getDeclaredMethod(routeModel.getMethod(), HttpServletRequest.class, HttpServletResponse.class);
                            Object[] argument = new Object[2];
                            argument[0] = req;
                            argument[1] = res;
                            method.invoke(routeModel.getController(), argument);
                            return;
                        } catch (IllegalAccessException ex) {
                            System.out.println("IllegalAccessException");
                        } catch (InvocationTargetException ex) {
                            System.out.println("InvocationTargetException");
                        } catch(NoSuchMethodException ex) {
                            System.out.println("NoSuchMethodException");
                        }
                    }
                }
            }
        }
        
        abort(404, req, res);
    }

    private void abort(int code, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/views/" + code + ".jsp");
        requestDispatcher.forward(req, res);
    }
}
