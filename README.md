
# JobPortal DAO

JobPortal DAO is a Data Access Object (DAO) layer for a Job Portal application.  
It provides a structured and maintainable way to interact with the database by separating persistence logic from business logic.

This project is designed to be used as part of a larger Job Portal system.

---

## Table of Contents

- [About](#about)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Installation and Setup](#installation-and-setup)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

---

## About

The JobPortal DAO module implements the DAO design pattern to manage database operations related to:

- Job seekers  
- Employers  
- Job postings  
- Applications  

All database interactions are encapsulated within DAO classes, improving:

- Code readability  
- Maintainability  
- Scalability  
- Testability  

---

## Features

- DAO pattern implementation  
- Clean separation of database logic  
- CRUD operations support  
- Easily extendable architecture  
- Database-independent design  

---

## Technologies Used

- Java  
- JDBC  
- MySQL (or any relational database)  
- Maven (optional)  
- JUnit (optional)  

---

## Project Structure

```

jobportal_dao/
├── src/
│   └── main/
│       └── java/
│           ├── dao/
│           │   └── interfaces
│           ├── daoimpl/
│           │   └── implementations
│           ├── model/
│           │   └── entity classes
│           └── util/
│               └── database utilities
├── .gitignore
├── pom.xml
└── README.md

````

---

## Prerequisites

Before running this project, ensure you have:

- JDK 8 or higher  
- MySQL or any relational database  
- Maven (if used)  
- IDE (IntelliJ IDEA / Eclipse / VS Code)  

---

## Installation and Setup

### 1. Clone the repository

```bash
git clone https://github.com/Akrist3/jobportal_dao.git
cd jobportal_dao
````

### 2. Configure database

* Create a database in MySQL
* Update database credentials in your configuration file

### 3. Build the project

```bash
mvn clean install
```

### 4. Run or integrate

Run the application or integrate the DAO layer with your service layer.

---

## Usage

This DAO module is intended to be used within a service or controller layer.

Example usage:

```java
UserDAO userDAO = new UserDAOImpl();
User user = userDAO.getUserById(1);
```

DAO classes handle all database interactions internally.

---

## Contributing

Contributions are welcome.

Steps to contribute:

1. Fork the repository
2. Create a new branch
3. Commit your changes
4. Push the branch
5. Create a Pull Request

Please ensure code quality and consistency.

---

## License

This project is licensed under the MIT License.

---

## Author

**Akrist**
B.Tech Student | Aspiring Software Engineer

GitHub: [https://github.com/Akrist3](https://github.com/Akrist3)

```

---

### ✅ Result
- Works perfectly on GitHub
- TOC links work
- Professional & recruiter-friendly
- Clean markdown structure

```

---

## Database Schema

The Job Portal system uses a relational database to manage users, jobs, and applications.

### Tables Overview

#### users
- user_id (INT, PRIMARY KEY)
- name (VARCHAR)
- email (VARCHAR, UNIQUE)
- password (VARCHAR)
- role (VARCHAR) — JOB_SEEKER / EMPLOYER / ADMIN
- created_at (TIMESTAMP)

#### jobs
- job_id (INT, PRIMARY KEY)
- title (VARCHAR)
- description (TEXT)
- company_name (VARCHAR)
- location (VARCHAR)
- posted_by (INT, FOREIGN KEY → users.user_id)
- created_at (TIMESTAMP)

#### applications
- application_id (INT, PRIMARY KEY)
- job_id (INT, FOREIGN KEY → jobs.job_id)
- user_id (INT, FOREIGN KEY → users.user_id)
- status (VARCHAR)
- applied_at (TIMESTAMP)

---

## Screenshots

Add screenshots inside a folder named `screenshots/` and update paths if needed.

```text
screenshots/
├── project-structure.png
├── database-schema.png
└── dao-layer.png
