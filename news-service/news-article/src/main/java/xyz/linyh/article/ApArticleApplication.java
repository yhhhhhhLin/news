package xyz.linyh.article;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("xyz.linyh.article.mapper")
@EnableFeignClients(basePackages = "xyz.linyh.feign")
@EnableAsync //开启异步调用
public class ApArticleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApArticleApplication.class,args);
    }
}
