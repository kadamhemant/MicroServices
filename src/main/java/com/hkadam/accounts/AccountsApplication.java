package com.hkadam.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info=@Info(title = "Account Microservice Rest API Documentation",
        description = "Bank accounts Microservice Rest API Documentation",
                version = "v1",
                contact = @Contact(name = "Hemant Kadam",
                email = "kadamhemant53@gmail.com",
                url = "https://www.test.com"),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.test.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Bank account documentation",
                url="https://www.test.com"
        )

)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
