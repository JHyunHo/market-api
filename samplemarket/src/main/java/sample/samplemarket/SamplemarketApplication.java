package sample.samplemarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SamplemarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamplemarketApplication.class, args);
	}

}
