
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import servlet.ServletLifeCircle;

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


        // spring -> dispatcher servlet -> @Controller
        tomcat.start();
        tomcat.getServer().await();
    }
}
