package start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages={"api.services"})
public class SpringBootWebApplication  extends SpringBootServletInitializer {
	
	/**
	 * Manual Start
	 * @param args
	 */
	public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }
	
	/**
	 * Web Start
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootWebApplication.class);
	}

}
