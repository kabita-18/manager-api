package llts.com.deliciousbytes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan("ltts.com")
@EntityScan("ltts.com.model")
@EnableJpaRepositories("ltts.com.jpa")
public class DeliciousBytesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliciousBytesApplication.class, args);
		System.out.println("Server Started....");
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedOrigins("http://localhost:5173") 
	            .allowedMethods("GET", "POST", "PUT", "DELETE") 
				.allowCredentials(true) ;
			}
		};
	}


}
