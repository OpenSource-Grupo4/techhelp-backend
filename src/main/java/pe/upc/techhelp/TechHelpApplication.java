package pe.upc.techhelp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableJpaAuditing
public class TechHelpApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechHelpApplication.class, args);
    }

    @Configuration
    public static class Configuration{
        @Bean
        public WebMvcConfigurer corsConfigurer(){
            return new WebMvcConfigurer() {
                @Override
                public void corsMapping(CorsRegistry registry){
                    registry.addMapping("/**")
                            .allowedOrigins()
                            .allowedMethods("HEAD","GET", "POST", "PUT", "DELETE","PATCH")
                            .allowedHeaders("*");
                }
            };
        }
    }
}
