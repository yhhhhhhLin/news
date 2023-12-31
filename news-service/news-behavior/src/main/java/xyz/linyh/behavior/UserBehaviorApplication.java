package xyz.linyh.behavior;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserBehaviorApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserBehaviorApplication.class,args);
    }
}
