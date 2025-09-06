# Patient Management System — Backend Service

A Spring Boot–based backend service providing CRUD (Create, Read, Update, Delete) operations for a patient management system. Serves as the core API layer for managing patient-related data.

## Table of Contents

- [Overview](#overview)  
- [Project Structure](#project-structure)  
- [Features](#features)  
- [Getting Started](#getting-started)  
- [How to Use](#how-to-use)  
- [Technologies](#technologies)  
- [Future Improvements](#future-improvements)  
- [License](#license)

---

## Overview

This repository is designed as the **backend service** for a patient management system, providing RESTful CRUD APIs using Spring Boot. It supports building and managing patient data via a core service—ideal for building a full-stack or microservices architecture.

---

## Project Structure

.
├── .idea/ — IDE-specific configuration files
├── api-requests/ — Contains code for making API calls (client-side or test scripts)
│ └── patient-service/
├── patient-service/ — Core Spring Boot module for handling patient operations
├── patient-management.iml — IntelliJ IDEA project file


---

## Features

- **CRUD APIs for Patient Data** — Manage patient records (create, retrieve, update, delete).  
- **Spring Boot Foundation** — Preconfigured for rapid development and deployment.  
- **Clean Separation** — The `patient-service` module encapsulates all business logic.  
- **API Consumers** — Includes `api-requests/patient-service` folder for integration testing or API usage examples.  

---

## Getting Started

### Prerequisites

- Java 17+  
- Maven or Gradle  
- (Optional) IntelliJ IDEA for development

### Setup

1. **Clone the Repository**

   ```bash
   git clone https://github.com/jiteshjitsun/patient-management-system.git
   cd patient-management-system
mvn clean install
mvn spring-boot:run
