package top.testops.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
  * @ClassName FeignConfig
  * @Description TODO
  * @author carson
  * @date 2020/4/8
**/
public class FeignConfig {
    @Bean
    public Logger.Level logger() {
        return Logger.Level.FULL;
    }
}
