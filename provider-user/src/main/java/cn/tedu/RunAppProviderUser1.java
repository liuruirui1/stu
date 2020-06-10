package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient //表示这是一个Eureka客户端
public class RunAppProviderUser1 {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(RunAppProviderUser1.class, args);
	}

}
