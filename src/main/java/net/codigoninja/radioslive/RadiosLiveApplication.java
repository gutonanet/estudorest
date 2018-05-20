package net.codigoninja.radioslive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "net.codigoninja")
@SpringBootApplication
public class RadiosLiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadiosLiveApplication.class, args);
	}
}
