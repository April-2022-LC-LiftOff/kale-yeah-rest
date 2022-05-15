package kaleyearest.project;

//import kaleyearest.project.config.RedisHashComponent;
//import kaleyearest.project.config.RedisHashComponent;
//import kaleyearest.project.dto.ApiKey;
//import kaleyearest.project.util.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
//@DependsOn("jedisConnectionFactory")
public class ProjectApplication {

//	@Autowired
//	private RedisHashComponent redisHashComponent;
//
//	@Value("${api.key}")
//	private String apiKey;
//
//	@PostConstruct
//	public void initialRedis() {
//		List<ApiKey> apiKeys = new ArrayList<>();
//		apiKeys.add(new ApiKey("kaleayeah!", Stream.of(AppConstants.INGREDIENT_SERVICE_KEY,
//				AppConstants.RECIPES_SERVICE_KEY).collect(Collectors.toList())));
//
//		List<Object> list = redisHashComponent.hValues(AppConstants.RECORD_KEY);
//		if(list.isEmpty()){
//			apiKeys.forEach(k -> redisHashComponent.hSet(AppConstants.RECORD_KEY,k.getKey() , k));
//		}
//	}

//	@Bean
//	public RouteLocator gatewayRoutes(RouteLocatorBuilder routeLocatorBuilder)
//	{
//		return routeLocatorBuilder.routes()
//				.route(AppConstants.INGREDIENT_SERVICE_KEY, rt -> rt.path("/ingredients/**")
//						.uri("http://localhost:8081/"))
//				.route(AppConstants.RECIPES_SERVICE_KEY,rt -> rt.path("/recipes/**")
//						.uri("http://localhost:8082/"))
//				.build();
//
//	}




	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}


}
