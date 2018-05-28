package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wuy on 2018/5/28.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerHaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerHaApplication.class,args);
    }
}
