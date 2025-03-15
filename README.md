# Productly - Build Automation & CI/CD Teaching Example

## Overview

This repository contains a simple Spring Boot CRUD application called "Productly" that demonstrates build automation and CI/CD integration concepts. It serves as a teaching example for the "Software Engineering in Practice" course at the Department of Management Science and Technology, Athens University of Economics and Business.

The application provides basic product management functionality and is used to demonstrate:

- Maven build automation
- Docker containerization
- GitHub Actions CI/CD workflows
- Code quality checks and testing

## Purpose

This example application is used as a demonstration tool for the lecture on build automation and CI/CD integration, co-taught with Prof. Tasos Gerasis (Github: `tasosger`). Students can use this as a reference when completing their own "Mission: Mars Deployment" CI/CD challenge assignment.

## Application Details

- **Framework**: Spring Boot 3.4.3
- **Embedded Database**: H2 (in-memory)
- **View Templates**: Thymeleaf
- **Build Tool**: Maven

## Getting Started

### Running Locally

1. Clone the repository
2. Build with Maven: `mvn clean package`
3. Run the application: `java -jar target/productly-0.0.1-SNAPSHOT.jar`
4. Access the application at http://localhost:8080/products

### Using Docker

1. Build the Docker image: `docker build -t productly:latest .`
2. Run the container: `docker run -p 8080:8080 productly:latest`
3. Access the application at http://localhost:8080/products

## License

This code is provided for educational purposes only.
