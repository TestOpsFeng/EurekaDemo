package top.testops.feign;

import feign.Logger;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.testops.dao.been.User;

/**
  * @ClassName UserFeignClient
  * @Description TODO
  * @author carson
  * @date 2020/4/8
**/
@FeignClient(name = "provider-user",configuration = UserFeignConfig.class)
public interface UserFeignClient {

    @GetMapping("/users/{id}")
    User findById(@PathVariable Long id);

}
class UserFeignConfig {
    @Bean
    public Logger.Level logger() {
        return Logger.Level.FULL;
    }
}