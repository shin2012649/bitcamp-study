package bitcamp.myapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

// Application을 실행하는데 필요한 객체를 설정하는 일을 한다.
//
@ComponentScan(
        basePackages = "bitcamp.myapp.controller",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.REGEX,
                pattern = "bitcamp.myapp.controller.MemberController"
        )
)
public class AppConfig {
  public AppConfig() {
    System.out.println("AppConfig() 호출됨!");
  }

  @Bean
  public MultipartResolver multipartResolver() {
    return new StandardServletMultipartResolver();
  }
}
