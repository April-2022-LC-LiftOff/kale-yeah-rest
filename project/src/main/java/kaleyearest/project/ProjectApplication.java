package kaleyearest.project;

import kaleyearest.project.Data.UserRepository;
import kaleyearest.project.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}


	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
//		this.userRepository.save(new User("educia27","edd990@aol.com","Eduardo Cornelius"));
//		this.userRepository.save(new User("amg7v7","arnold@arnold.com","Andrew Ragnarson"));
//		this.userRepository.save(new User("frankthetank","frank@frankenstein.com","Frank Sinatra"));
	}
}
