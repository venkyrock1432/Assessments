package CustomerService1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {
	@Value("property value")
    private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    @PostConstruct
    public void init() {
    	System.out.println("Initializing Method after properties are set :"+ message);
    	
    }
    @PreDestroy
    public void shutdown() {
    	
    	System.out.println("Spring Container is destroy");
    	
    }

}
