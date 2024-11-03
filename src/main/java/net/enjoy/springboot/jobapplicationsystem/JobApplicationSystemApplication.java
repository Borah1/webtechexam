package net.enjoy.springboot.jobapplicationsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class JobApplicationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobApplicationSystemApplication.class, args);
    }
}
