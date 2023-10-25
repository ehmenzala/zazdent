package app;

public class RouteModel {
    
    private final Controller controller;
    private final String method;
    
    public RouteModel(Controller controller, String method) {
        this.controller = controller;
        this.method = method;
    }
    
    public Controller getController() {
        return this.controller;
    }
    
    public String getMethod() {
        return this.method;
    }
}
