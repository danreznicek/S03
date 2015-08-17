package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Confggg {

    @Bean
    MyService myService() {
        return new MyService();
    }
  
}