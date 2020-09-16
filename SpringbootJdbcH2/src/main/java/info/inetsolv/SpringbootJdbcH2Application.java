package info.inetsolv;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootJdbcH2Application {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@GetMapping("/employees")
	public List<Map<String, Object>> listOfEmployees(){
		return jdbcTemplate.queryForList("select * from employees"); 
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcH2Application.class, args);
	}

}
