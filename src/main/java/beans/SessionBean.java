package beans;

import jakarta.faces.context.FacesContext;
import java.io.IOException;

public class SessionBean {

    private String username;
    private String passwd;
    private String allowedUser = "admin";
    private String allowedPasswd = "admin";

    public void authenticate() throws IOException {
        if (username.equals(allowedUser) && passwd.equals(allowedPasswd)) {
            FacesContext.getCurrentInstance().getExternalContext().redirect("/zazdentfaces/faces/views/dentists.xhtml");
        } else {
            System.out.println("Access denied");
        }
    }

    /* Getters and Setters*/
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
