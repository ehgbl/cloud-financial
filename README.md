# Cloud Financial Analytics

A Java-based banking application that simulates basic banking operations like account management, user authentication, and transaction handling. The app supports **Checking** and **Savings** accounts, with features like CSV data import, interest rate calculations, and database integration for persistent storage.

## Features

- **Account Management**:
  - Create and manage **Checking** and **Savings** accounts.
  - Perform deposits, withdrawals, and balance checks.
  - Calculate interest for savings accounts.
  - Enforce transaction limits for checking accounts.

- **CSV Data Processing**:
  - Import customer account details (name, account type, deposit) from a CSV file.
  - Dynamically create accounts based on imported data.

- **User Authentication**:
  - Basic login functionality to simulate user authentication (planned feature: password hashing).

- **Database Integration**:
  - Store account and transaction data in a relational database (MySQL).

## Technologies Used

- **Java**: Core programming language for the application.
- **Spring Boot**: Framework for building the application.
  - **Spring Data JPA**: For database interactions.
  - **Spring Security**: For user authentication.
- **PostgreSQL/MySQL**: Relational database to store account and transaction data.
- **Apache Commons CSV / OpenCSV**: For handling CSV file imports.

## Getting Started

### Prerequisites

- Java 17 or higher
- MySQL database
- Maven for building the project

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/banking-app.git
   cd banking-app
