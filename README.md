# Anudip Assignments & Projects

A collection of Java assignments, DSA practice sessions, and full-stack projects completed during the Anudip Foundation training program.

---

## 📁 Repository Structure

```
AnudipAssignmentsAndProject/
├── DSA/                        # Data Structures & Algorithms (Java)
├── JavaDS/                     # Java Data Structures Practice
├── onlinefoodplaza/            # Online Food Plaza (Console App)
└── smart_library_system/       # Smart Library System (Final Project)
```

---

## 📚 Projects

### 1. DSA — Data Structures & Algorithms

Java assignments covering core DSA and collections concepts.

| Session | Topic | Key Files |
|---------|-------|-----------|
| InterviewPreparation | Static blocks, toString | `StaticBlock.java`, `Test.java` |
| arrayfrequency | Arrays vs Collections, Comparable | `FindFrequency.java`, `arrayListString.java` |
| Session 3 | Comparable vs Comparator, Cursors | `ComparableVsComparator.java`, `Cursor.java` |
| Session 4 | HashMap, HashCode/Equals, Frequency | `MapInCollection.java`, `HashCodeVsEquals.java` |
| Session 5 | Set — Telecom Registration System | `Telecom.java` |
| Session 6 | Generics, Iterators, Fail-Safe/Fast | `TestGeneric.java`, `FailSafeFailFast.java` |
| Session 7 | Strings — Reverse, Palindrome, Buffer vs Builder | `HowToReverseString.java`, `StringLiteralVsStringObject.java` |

---

### 2. JavaDS — Java Data Structures

Additional practice on Generics, Iterators, and Concurrent Collections.

- **Fail-Safe vs Fail-Fast** iterators with `ConcurrentHashMap`
- **Generics** with custom `MyDataType<T>`
- **Iterator, ListIterator, Enumeration** traversal patterns

---

### 3. Online Food Plaza

A console-based food ordering system built with **Java + JDBC + MySQL**.

**Architecture**: MVC with layered design (Controller → Service → DAO)

| Layer | Description |
|-------|-------------|
| `view/` | Console dashboard with Admin & User modules |
| `controller/` | Request routing (`UserController`) |
| `service/` | Business logic (`UserServiceImpl`) |
| `dao/` | Database access with JDBC (`UserDaoImpl`) |
| `dto/` | Data transfer objects (`UserDTO`) |
| `utility/` | Database connection helper (`DbConnection`) |

**Features**:
- User registration, login, CRUD operations
- Admin dashboard (food item management, order tracking)
- User dashboard (browse food, cart, order booking)

**Tech Stack**: Java, JDBC, MySQL, Maven

---

### 4. Smart Library System ⭐ *(Final Project)*

A full-featured console-based library management system with advanced features.

**Architecture**: MVC with layered design (Controller → Service → DAO)

| Layer | Description |
|-------|-------------|
| `view/` | Interactive console dashboard with role-based access |
| `controller/` | Book, Member, and Transaction controllers |
| `service/` | Business logic with validation |
| `dao/` | JDBC-based data access with connection pooling |
| `dto/` | Book, Member, Transaction models |
| `exception/` | Custom exceptions for error handling |
| `util/` | DB connection, input validation, password hashing |

**Features**:
- 📖 Book Management — Add, update, delete, search books
- 👤 Member Management — Register, update, search members
- 🔄 Transaction Management — Issue, return books with due date tracking
- 🔒 Password hashing with SHA-256
- ✅ Input validation across all operations
- 📊 Database schema with proper constraints and relationships

**Tech Stack**: Java, JDBC, MySQL, Maven

📄 See [PROJECT_DOCUMENTATION.md](smart_library_system/PROJECT_DOCUMENTATION.md) for full details  
🚀 See [RUN_GUIDE.md](smart_library_system/RUN_GUIDE.md) for setup instructions

---

## 🛠️ Tech Stack

| Technology | Usage |
|------------|-------|
| **Java 17+** | Core language |
| **JDBC** | Database connectivity |
| **MySQL** | Relational database |
| **Maven** | Build & dependency management |
| **Git** | Version control |

---

## 👤 Author

**Shivansh** — Anudip Foundation (Batch D6594)
