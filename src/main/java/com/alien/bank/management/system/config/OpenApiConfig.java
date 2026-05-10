package com.alien.bank.management.system.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "🏦 Sahab Bank - REST API",
                description = """
                        **Sahab Bank** is a modern digital banking system built with Spring Boot 3.
                        
                        ## Features
                        - 🔐 JWT-based Authentication & Authorization
                        - 👥 User Management (Customer & Admin roles)
                        - 💳 Multi-Account Support per Customer
                        - 💰 Secure Transactions (Deposit & Withdraw)
                        - 📊 Account Statements & Profile Management
                        
                        ## Tech Stack
                        - **Backend:** Java 21, Spring Boot 3.3.5, Spring Security
                        - **Database:** PostgreSQL with JPA / Hibernate
                        - **Documentation:** OpenAPI 3.0 (Swagger UI)
                        - **Build Tool:** Maven
                        
                        ## How to Use
                        1. Register a new user via `POST /auth/register`
                        2. Login via `POST /auth/login` to receive a JWT token
                        3. Click the **Authorize** button above and paste the token
                        4. Now you can access all protected endpoints!
                        """,
                version = "1.0.0",
                contact = @Contact(
                        name = "Raed",
                        email = "your.email@example.com",
                        url = "https://github.com/Hariqano"
                ),
                license = @License(
                        name = "MIT License",
                        url = "https://opensource.org/licenses/MIT"
                )
        ),
        servers = {
                @Server(
                        description = "Local Development Server",
                        url = "http://localhost:8080"
                )
        },
        security = {
                @SecurityRequirement(
                        name = "bearerAuth"
                )
        }
)
@SecurityScheme(
        name = "bearerAuth",
        description = "Paste your JWT token here (without 'Bearer' prefix)",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}