package xyz.vegaone.userProvisioning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserProvisioningApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProvisioningApplication.class, args);
	}
}
