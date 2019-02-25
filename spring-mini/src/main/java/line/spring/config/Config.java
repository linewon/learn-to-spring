package line.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

//	@Bean(name = "myString")
	@Bean // default named by method-name
	public String myString() {
		return "this is my string";
	}
}
