
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;
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
        System.out.println(
                Main.class.getProtectionDomain()
                        .getCodeSource()
                        .getLocation()
        );

        StandardRoot resources = new StandardRoot(context);

        resources.addPreResources(
                new DirResourceSet(
                        resources,
                        "/WEB-INF/classes",
                        new File("target/classes").getAbsolutePath(),
                        "/"
                )
        );

        context.setResources(resources);
        tomcat.start();
        tomcat.getServer().await();
    }
}
