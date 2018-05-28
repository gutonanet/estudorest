package net.codigoninja.radioslive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "net.codigoninja")
@SpringBootApplication
public class RadiosLiveApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RadiosLiveApplication.class, args);
	}
	
	  @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(RadiosLiveApplication.class);
	  }
}
