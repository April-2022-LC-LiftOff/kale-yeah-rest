package kaleyearest.project.config;

//import kaleyearest.project.util.AppConstants;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig
{
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder routeLocatorBuilder)
    {
        return routeLocatorBuilder.routes()
                .route("Ingredient Service", rt -> rt.path("/ingredients/**")
                        .uri("http://localhost:8080/"))
                .route("Recipe Service",rt -> rt.path("/recipes/**")
                        .uri("http://localhost:8080/"))
                .route("Meal Planning Service",rt -> rt.path("/planning/**")
                        .uri("http://localhost:8080/"))
                .build();


    }
}