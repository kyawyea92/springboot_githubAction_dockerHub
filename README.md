# Spring Boot Base Project with GitHub Actions and DockerHub

## Overview
This project is a Spring Boot base application that leverages GitHub Actions for CI/CD and automatically deploys Docker images to DockerHub.

## Features
- Spring Boot application setup
- GitHub Actions for CI/CD automation
- Docker image creation and deployment to DockerHub

## Prerequisites
Ensure you have the following installed before setting up the project:
- Java 21+
- Maven
- Docker
- GitHub account with repository access
- DockerHub account

## Project Setup
### 1. Clone the repository
```bash
git clone https://github.com/kyawyea92/kyawyea92/springboot_githubAction_dockerHub.git
cd springboot_githubAction_dockerHub
```

### 2. Build the Project
```bash
mvn clean package
```

### 3. Run Locally
```bash
mvn spring-boot:run
```

## GitHub Actions Workflow
A GitHub Actions workflow is set up to:
- Build the project
- Create a Docker image
- Push the Docker image to DockerHub

### 1. Configure GitHub Secrets
Go to your GitHub repository **Settings > Secrets and variables > Actions** and add the following secrets:
- `DOCKER_USERNAME` – Your DockerHub username
- `DOCKER_PASSWORD` – Your DockerHub password or access token

### 2. GitHub Actions Workflow File (.github/workflows/docker_hub.yml)


## Running the Docker Container
Once the Docker image is pushed to DockerHub, you can pull and run it using:
```bash
docker run -p 8080:8080 kyawyealwin/springboot_github_action:latest
```

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing
Feel free to fork this repository and contribute by submitting a pull request. 🚀

