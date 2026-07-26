# 📚 Book Haven — Smart Library Management System

A **Java console application** built with strict **MVC (Model-View-Controller)** architecture, demonstrating professional-grade software engineering with MySQL database integration, SHA-256 password security, dynamic fine computation, and a premium CLI interface.

> 📖 **Submission & Viva Guide**: For an in-depth technical explanation, ER diagrams, fine calculation formulas, sequence flowcharts, and top 15 Viva Voce Q&As, see [PROJECT_DOCUMENTATION.md](file:///c:/ANP-D6594/WORKSPACED6594/smart_library_system/PROJECT_DOCUMENTATION.md).

---

## 🏗️ Architecture (MVC + DAO Pattern)

```
com.shivansh.org
├── controller/          ← CONTROLLER LAYER (Request handling & delegation)
│   ├── BookController.java
│   ├── MemberController.java
│   └── TransactionController.java
│
├── dao/                 ← DATA ACCESS LAYER (Database operations)
│   ├── BookDao.java              (Interface)
│   ├── MemberDao.java            (Interface)
│   ├── TransactionDao.java       (Interface)
│   └── impl/
│       ├── BookDaoImpl.java      (MySQL Implementation)
│       ├── MemberDaoImpl.java
│       └── TransactionDaoImpl.java
│
├── dto/                 ← MODEL LAYER (Data Transfer Objects)
│   ├── Book.java
│   ├── Member.java
│   └── Transaction.java
│
├── exception/           ← CUSTOM EXCEPTION HIERARCHY
│   ├── LibraryException.java        (Base)
│   ├── BookNotFoundException.java
│   ├── MemberNotFoundException.java
│   ├── TransactionException.java
│   └── ValidationException.java
│
├── service/             ← BUSINESS LOGIC LAYER
│   ├── BookService.java             (Interface)
│   ├── MemberService.java           (Interface)
│   ├── TransactionService.java      (Interface)
│   └── impl/
│       ├── BookServiceImpl.java
│       ├── MemberServiceImpl.java
│       └── TransactionServiceImpl.java
│
├── util/                ← UTILITY CLASSES
│   ├── DbConnection.java        (Connection pooling & schema init)
│   ├── InputValidator.java       (Email, password, name validation)
│   └── PasswordUtil.java         (SHA-256 hashing)
│
└── view/                ← VIEW LAYER (Console UI)
    └── Dashboard.java            (ANSI-colored premium CLI)
```

---

## ✨ Key Features

| Feature | Description |
|---|---|
| **MVC Architecture** | Strict separation — View → Controller → Service → DAO → Database |
| **SHA-256 Password Hashing** | Member passwords are never stored in plaintext |
| **Dynamic Fine Computation** | ₹5.00 per overdue day, calculated at runtime |
| **Membership-Based Borrow Limits** | Regular: 3, Student: 5, Faculty: 10 books |
| **Custom Exception Hierarchy** | `LibraryException` → `BookNotFoundException`, `TransactionException`, etc. |
| **Admin Overdue Report** | One-click report of all overdue books with total fine summary |
| **Admin Member Management** | Full CRUD for members including deletion |
| **Premium CLI UI** | ASCII art banner, ANSI colors, Unicode box-drawing tables |
| **Input Validation** | Regex email validation, password strength, numeric range checks |
| **10 Pre-Seeded Books** | Library starts with classic literature catalog |
| **Database Auto-Migration** | Schema upgrades (ISBN, phone columns) applied automatically |

---

## 🛠️ Tech Stack

| Component | Technology |
|---|---|
| Language | Java 11 |
| Build Tool | Apache Maven |
| Database | MySQL 8.x |
| JDBC Driver | mysql-connector-j 8.0.33 |
| Testing | JUnit 4.13.2 |
| Security | SHA-256 (java.security.MessageDigest) |

---

## 🚀 Getting Started

### Prerequisites
- Java 11+ (JDK)
- Apache Maven 3.6+
- MySQL 8.x running on `localhost:3306`
- MySQL user: `root` / password: `root`

### Setup & Run

```bash
# 1. Clone and navigate to the project
cd smart_library_system

# 2. Create the database (optional — app auto-creates it)
mysql -u root -p < schema.sql

# 3. Compile the project
mvn clean compile

# 4. Run the application
mvn exec:java

# 5. Run unit tests
mvn test
```

### Default Credentials

| Role | Username/Email | Password |
|---|---|---|
| Admin | `admin` | `123` |
| Member (Student) | `shivnsh01@gmail.com` | `password123` |
| Member (Faculty) | `jane.smith@example.com` | `password123` |

---

## 📊 Database Schema

The system uses **3 core tables** with foreign key relationships:

```
books ──────────────┐
  book_id (PK)      │
  title              │
  author             │
  isbn               │
  genre              │
  total_copies       │
  available_copies   │
                     │
members ─────────┐  │
  member_id (PK) │  │
  first_name     │  │
  last_name      │  │
  email (UNIQUE) │  │
  phone          │  │
  password       │  │
  membership_type│  │
                 │  │
transactions ────┘──┘
  transaction_id (PK)
  member_id (FK) ──→ members
  book_id (FK) ────→ books
  issue_date
  due_date
  return_date
  status
```

---

## 🧪 Testing

Unit tests cover:
- **Password hashing** — SHA-256 determinism, null safety, hash length
- **Input validation** — Email regex, password strength, name format, integer parsing
- **Fine calculation** — On-time, early, late, and currently-overdue scenarios

```bash
mvn test
# Tests run: 3, Failures: 0, Errors: 0, Skipped: 0 ✓
```

---

## 👨‍💻 Author

**Shivansh** — `com.shivansh.org`

---

## 📄 License

This project is developed as an academic project for demonstration purposes.
