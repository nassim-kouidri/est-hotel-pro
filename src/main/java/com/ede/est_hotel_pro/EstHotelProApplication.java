package com.ede.est_hotel_pro;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.TimeZone;

@SpringBootApplication
@EnableScheduling
@EnableJpaAuditing
@OpenAPIDefinition(info = @Info(title = "EstHotelPro API", version = "1.0", description = "Documentation de l'API EstHotelPro"))
public class EstHotelProApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Africa/Algiers"));
        SpringApplication.run(EstHotelProApplication.class, args);
    }

}
