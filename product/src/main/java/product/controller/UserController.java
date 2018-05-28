package product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuy on 2018/5/28.
 */
@RestController
public class UserController {

    @GetMapping("/{id}")
    public String findById(@PathVariable Long id){
        return "{\"id\":\""+id+"\"}";
    }
}
