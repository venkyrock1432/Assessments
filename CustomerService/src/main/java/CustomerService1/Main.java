package CustomerService1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.SpringCore.CustomerService.CustomerService;
import com.SpringCore.CustomerService.CustomerServiceConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(CustomerServiceConfig.class);
		
		CustomerService c = context.getBean(CustomerService.class);
		
		System.out.println(c);
		
		context.close();

	}

}
