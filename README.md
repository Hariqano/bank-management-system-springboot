<div align="center">

# 🏦 Sahab Bank

### Modern Digital Banking System — Built with Spring Boot 3 & PostgreSQL

[![Java](https://img.shields.io/badge/Java-21-orange?style=flat-square&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.5-brightgreen?style=flat-square&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-blue?style=flat-square&logo=postgresql&logoColor=white)](https://www.postgresql.org/)
[![Maven](https://img.shields.io/badge/Maven-3.9-red?style=flat-square&logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-yellow?style=flat-square)](https://opensource.org/licenses/MIT)

</div>

---

## 📖 Overview

**Sahab Bank** is a production-grade **RESTful banking API** built with the latest Java ecosystem. It provides secure user authentication, multi-account management, and real-time transaction processing — all backed by a robust PostgreSQL database and documented through interactive Swagger UI.

The project follows industry-standard patterns including **Layered Architecture**, **DTO Pattern**, **Repository Pattern**, and **JWT-based Stateless Authentication**, making it a reference implementation for modern Spring Boot applications.

---

## ✨ Features

- 🔐 **JWT-Based Authentication** — Stateless, secure token-based authentication system
- 👥 **Role-Based Access Control** — Separate permissions for `CUSTOMER` and `ADMIN`
- 💳 **Multi-Account Management** — Customers can open multiple bank accounts
- 💰 **Secure Transactions** — Deposit and withdrawal with full validation
- 🛡️ **Password Encryption** — BCrypt hashing for all credentials
- 📊 **Account Statements** — Track balance, card number, CVV, and transaction history
- 📖 **Auto-Generated API Docs** — Interactive Swagger UI for all endpoints
- 🏗️ **Clean Architecture** — Separation of concerns across multiple layers

---

## 🛠️ Tech Stack

### Backend
| Technology | Version | Purpose |
|------------|---------|---------|
| Java | 21 LTS | Core language |
| Spring Boot | 3.3.5 | Application framework |
| Spring Security | 6.x | Authentication & authorization |
| Spring Data JPA | 3.x | Database abstraction |
| Hibernate | 6.5.3 | ORM implementation |
| JJWT | 0.12.6 | JWT token generation/validation |
| Lombok | 1.18.34 | Boilerplate reduction |

### Database
- **PostgreSQL 16** — Primary relational database
- **H2** — In-memory database for testing

### Documentation & Tools
- **OpenAPI 3.0 / Swagger UI** — Interactive API documentation
- **Maven** — Dependency management & build automation
- **Docker** — Containerization (optional)

---

## 🏗️ Project Structure