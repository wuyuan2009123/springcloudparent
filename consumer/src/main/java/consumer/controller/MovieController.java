package consumer.controller;

import consumer.controller.inter.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuy on 2018/5/28.
 */
@RestController
public class MovieController {
    @Autowired
    private UserFeignClient userFeignClient;
    @GetMapping("/consumer/{id}")
    public String findUserById(@PathVariable Long id){
        return userFeignClient.findById(id);
    }
}
