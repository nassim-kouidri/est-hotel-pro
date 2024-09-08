package com.ede.est_hotel_pro;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "EstHotelPro API", version = "1.0", description = "Documentation de l'API EstHotelPro"))
public class EstHotelProApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstHotelProApplication.class, args);
    }

}