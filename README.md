# Instagram Basic Design

This project is a basic implementation of the backend for Instagram, created using Spring Boot.

## Table of Contents

- Introduction
- Features
- Setup
- Usage
- API Endpoints
- Models
- Services
- Repositories
- Controllers

## Introduction

This project serves as a basic backend design for an Instagram-like application. It includes functionalities for user authentication, post creation, and retrieval.

## Features

- User authentication (sign up, sign in)
- User details update
- Post creation
- Get posts by user

## Setup

1. Ensure you have Java and Maven installed.
2. Clone this repository.
3. Build the project using Maven.
4. Run the application.

## Usage

Start the application and access the endpoints using a tool like Postman or a web browser.

## API Endpoints

- **Sign Up:** `POST /api/users/signup`
- **Sign In:** `POST /api/users/signin`
- **Update User Details:** `PUT /api/users/update`
- **Save Post:** `POST /api/posts/save`
- **Get Posts by User:** `GET /api/posts/user/{userId}`

## Models

### User

- `id: Long`
- `firstName: String`
- `lastName: String`
- `age: Integer`
- `email: String`
- `phoneNumber: String`
- `password: String`

### Post

- `id: Long`
- `postId: Integer`
- `createdDate: Timestamp`
- `updatedDate: Timestamp`
- `postData: String`
- `user: User`

### AuthenticationToken

- `id: Long`
- `tokenId: Long`
- `token: String`
- `tokenCreationDate: LocalDate`
- `user: User`

## Services

- `UserService`
- `PostService`
- `AuthenticationService`

## Repositories

- `UserRepo`
- `PostRepo`
- `AuthenticationRepo`

## Controllers

- `UserController`
- `PostController`
### Reference Documentation
For further reference, please consider the following sections:

* [Github Link]()
* [Official Apache Maven documentation](https://github.com/Anish1430/Instagram-Basic-Design)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Validation](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#io.validation)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
