# Microservices Architecture for Swiggy

## Overview
This repository contains the microservices architecture for Swiggy, an online food delivery platform. The architecture consists of two main microservices: Swiggy app and Restaurant service. These microservices communicate with each other to facilitate the ordering and delivery process.

## Components

### Swiggy App
The Swiggy app is responsible for handling user requests, displaying menus, managing orders, and tracking delivery status. It communicates with the Restaurant service to place orders and retrieve order status updates.

### Restaurant Service
The Restaurant service manages restaurant-related functionalities such as receiving orders, updating order statuses, and providing menu information. It is called by the Swiggy app to retrieve the status of orders.

### Gateway
The Gateway acts as an entry point for incoming requests. It is responsible for validating authentication tokens using the Identity service and routing requests to the appropriate microservice based on the request type.

### Identity Service
The Identity service is responsible for managing user authentication and authorization. It validates authentication tokens provided by clients (such as the Swiggy app) to ensure that the request is coming from an authenticated user.

## Communication Flow
1. The Swiggy app sends a request to the Gateway for a specific action (e.g., placing an order or checking order status).
2. The Gateway validates the authentication token provided by the Swiggy app using the Identity service.
3. If the token is valid, the Gateway routes the request to the appropriate microservice (Swiggy app or Restaurant service).
4. The microservice processes the request and sends back the response to the Gateway.
5. The Gateway forwards the response to the Swiggy app.

## Setup
To set up the microservices architecture locally, follow these steps:

1. Clone this repository.
2. Install dependencies for each microservice (Swiggy app, Restaurant service, Gateway, and Identity service).
3. Configure environment variables for each microservice (e.g., database connection strings, API keys).
4. Test the communication between microservices by sending requests through the Gateway.

## Contributing
Contributions to improve the architecture, add new features, or fix bugs are welcome! Please follow the contribution guidelines outlined in CONTRIBUTING.md.

