package example.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApp implements CommandLineRunner {

	@Autowired private PersonMapper mapper;

	public static void main(String... args) {
		SpringApplication.run(ExampleApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Started");
		System.out.println(mapper.findAll());
		System.out.println(mapper.findAllMap());
		System.out.println(mapper.findAllXml());
	}
}
