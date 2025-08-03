package Server.Server.global.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "INHAEVEN Server API",
                version = "1.0",
                description = "INHAEVEN (인하이븐) 팀 서버 API SWAGGER 입니다."
        )
)
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        Server localServer = new Server()
                .url("http://localhost:8080")
                .description("Local Server");

        Server devServer = new Server()
                .url("https://dev.inhaeven.com")
                .description("Dev Server");

        return new OpenAPI().servers(List.of(localServer, devServer));
    }
}
