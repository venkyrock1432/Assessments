package CustomerService1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpringCore.CustomerService.CustomerService;
@Configuration
public class CustomerServiceConfig {
	@Bean
	public CustomerService customerService() {
		return new CustomerService();
	}

}
