package com.ledao;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author LeDao
 */

@SpringBootApplication(scanBasePackages = "com.ledao")
@MapperScan("com.ledao.mapper")
@EnableScheduling
public class PetHospitalApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PetHospitalApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(PetHospitalApplication.class, args);
    }

}
