package cn.plasticlove.provider3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudProvider3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider3Application.class, args);
    }

}
