package cn.plasticlove.provider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider2Application.class, args);
    }

}
