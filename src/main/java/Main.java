
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import servlet.ServletLifeCircle;
import order.*;

import java.io.File;

public class Main {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        // Rất quan trọng
        tomcat.getConnector();

        tomcat.setBaseDir("tomcat-work");

        Context context = tomcat.addWebapp("", new File("src/main/webapp").getAbsolutePath());

        Tomcat.addServlet(context, "lifeServlet", new ServletLifeCircle());
        context.addServletMappingDecoded("/life", "lifeServlet");

        Tomcat.addServlet(context, "orderCreateServlet", new OrderCreateServlet());
        context.addServletMappingDecoded("/orders/create", "orderCreateServlet");

        Tomcat.addServlet(context, "orderListServlet", new OrderListServlet());
        context.addServletMappingDecoded("/orders", "orderListServlet");

        Tomcat.addServlet(context, "orderEditServlet", new OrderEditServlet());
        context.addServletMappingDecoded("/orders/edit", "orderEditServlet");

        Tomcat.addServlet(context, "orderDeleteServlet", new OrderDeleteServlet());
        context.addServletMappingDecoded("/orders/delete", "orderDeleteServlet");


        // spring -> dispatcher servlet -> @Controller
        tomcat.start();
        tomcat.getServer().await();
    }
}