package info.inetsolv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableConfigurationProperties(MyMessage.class)
public class DemoApplication {
	
	@Autowired
	private MyMessage myMessage;
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome to ur fav num " +myMessage.getMessageValue();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello world");
	}

}
