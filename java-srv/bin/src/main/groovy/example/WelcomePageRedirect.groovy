package example;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.boot.autoconfigure.jdbc.*;
import org.springframework.context.annotation.*;
import org.springframework.boot.autoconfigure.*;

@Configuration
@EnableAutoConfiguration(exclude=[DataSourceAutoConfiguration.class])
public class WelcomePageRedirect implements WebMvcConfigurer {

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("forward:/index.jsp");
    registry.addViewController("/tbl").setViewName("forward:/dogs.xhtml");
    registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
  }
}
