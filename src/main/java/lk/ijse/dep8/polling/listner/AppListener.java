package lk.ijse.dep8.polling.listner;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebListener
public class AppListener implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        /* This method is called when the servlet context is initialized(when the Web application is deployed). */

        System.setProperty("app.profiles.active","dev");
    }

}
