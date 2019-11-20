package com.sfi.solr;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletInitializer implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {
      System.out.println("tomcat start");
    }

    public void contextDestroyed(ServletContextEvent event) {
        //TODO ON DESTROY
    	System.out.println("tomcat stop");
    }

}


