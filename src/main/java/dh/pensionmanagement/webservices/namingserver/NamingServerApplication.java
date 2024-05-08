package dh.pensionmanagement.webservices.namingserver;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.Generated;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@Generated
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Eureka Naming Server",
		description = "<b>Naming Server:</b> Eureka <br><br>" +
				"<b>Server Link:</b> <a>http://localhost:8761</a> <br><br>" +
				"<b>Registered Microservices:</b> Pensioner Details, Process Pension and Authorization Microservice<br><br>"))
public class NamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamingServerApplication.class, args);
	}

}
