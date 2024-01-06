package dev.servicedescovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@SpringBootApplication
@EnableEurekaServer
public class ServicedescoveryApplication {

	public static void main(String[] args) {

		SpringApplication.run(ServicedescoveryApplication.class, args);
		List<Character> list = new ArrayList<>();
		Character[] set = list.toArray(new Character[1]);
		System.out.println(set);
	}

}
