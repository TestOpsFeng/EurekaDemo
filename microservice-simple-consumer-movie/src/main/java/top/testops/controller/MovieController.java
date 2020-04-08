package top.testops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.testops.dao.been.User;
import top.testops.feign.UserFeignClient;

import java.util.Optional;

/**
  * @ClassName MovieController
  * @Description TODO
  * @author carson
  * @date 2020/4/8
**/
@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;


    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id){
        User user = this.userFeignClient.findById(id);
        System.out.println(user);
        return user;
    }
}
