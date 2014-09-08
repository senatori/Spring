package hello;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

public class HelloWebXml extends SpringBootServletInitializer {
//A pure java class that provides an alternative to creating a web.xml by extending the SpringBootServletInitializer
//offers many configurable options by overriding methods. BUT!!! configure method
//is required

    //This method provides the means to register the classes that are needed to launch the application.
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);  //this is where you supply a handle to your Application configuration
    }


    //Remember, Application class has the @ComponentScan annotation, so it will find the web controller
    //if you didn't include it, you can add all of the components manually as @Beans

    //ALSO NOTE, the public static void main() is no longer needed when running it in WAR mode


    /*@Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }*/

}