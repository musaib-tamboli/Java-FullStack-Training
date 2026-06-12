# Hibernate + MySQL Setup and Execution Guide

## Project Overview

This project demonstrates:

- Hibernate ORM
    
- MySQL Database Connectivity
    
- Maven Dependency Management
    
- Entity Mapping
    
- One-to-One Mapping
    
- One-to-Many Mapping
    
- Many-to-Many Mapping
    
- Automatic Table Creation using Hibernate
    

---

# Prerequisites

Install the following:

### 1. Java

```bash
java -version
```

Recommended:

```text
Java 8 or later
```

### 2. Maven

```bash
mvn -version
```

### 3. MySQL Server

Verify MySQL is running:

```sql
SELECT VERSION();
```

### 4. Eclipse IDE

Recommended:

```text
Eclipse IDE for Enterprise Java Developers
```

---

# Project Structure

```text
hibernateDemo
│
├── src/main/java
│   ├── com.example
│   │   └── Student.java
│   │
│   ├── com.map
│   │   ├── Answer.java
│   │   ├── Question.java
│   │   └── MappingDemo.java
│   │
│   └── com.test
│       ├── Author.java
│       ├── Book.java
│       ├── Employee.java
│       ├── Project.java
│       └── HibernateExample.java
│
├── src/main/resources
│   └── hibernate.cfg.xml
│
└── pom.xml
```

---

# Step 1: Create Database

Open MySQL Workbench or MySQL CLI.

```sql
CREATE DATABASE trialhiber;
```

Verify:

```sql
SHOW DATABASES;
```

Expected:

```text
trialhiber
```

---

# Step 2: Configure Maven Dependencies

Add the following dependencies in pom.xml.

```xml
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.6.15.Final</version>
</dependency>

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.33</version>
</dependency>
```

Update Maven:

```text
Right Click Project
→ Maven
→ Update Project
```

Enable:

```text
Force Update of Snapshots/Releases
```

---

# Step 3: Create Hibernate Configuration

Location:

```text
src/main/resources/hibernate.cfg.xml
```

Configuration:

```xml
<hibernate-configuration>
    <session-factory>

        <property name="hibernate.connection.driver_class">
            com.mysql.cj.jdbc.Driver
        </property>

        <property name="hibernate.connection.url">
            jdbc:mysql://localhost:3306/trialhiber
        </property>

        <property name="hibernate.connection.username">
            root
        </property>

        <property name="hibernate.connection.password">
            YOUR_PASSWORD
        </property>

        <property name="hibernate.dialect">
            org.hibernate.dialect.MySQL8Dialect
        </property>

        <property name="hibernate.hbm2ddl.auto">
            create
        </property>

        <property name="hibernate.show_sql">
            true
        </property>

    </session-factory>
</hibernate-configuration>
```

---

# Step 4: Create Entity Classes

Example:

```java
@Entity
public class Student {

    @Id
    private int id;

    private String name;
}
```

Important:

Every Entity must have:

```java
@Entity
@Id
```

and a default constructor.

---

# Step 5: Add Entity Mapping

Inside hibernate.cfg.xml:

```xml
<mapping class="com.example.Student"/>
<mapping class="com.map.Answer"/>
<mapping class="com.map.Question"/>
<mapping class="com.test.Author"/>
<mapping class="com.test.Book"/>
<mapping class="com.test.Employee"/>
<mapping class="com.test.Project"/>
```

---

# Step 6: Create SessionFactory

```java
Configuration cfg =
        new Configuration();

cfg.configure();

SessionFactory factory =
        cfg.buildSessionFactory();
```

Purpose:

- Reads hibernate.cfg.xml
    
- Creates database connection
    
- Creates SessionFactory
    

---

# Step 7: Open Session

```java
Session session =
        factory.openSession();
```

Purpose:

Used to communicate with database.

---

# Step 8: Start Transaction

```java
Transaction tx =
        session.beginTransaction();
```

Purpose:

Used for Insert, Update, Delete operations.

---

# Step 9: Save Objects

```java
Student s = new Student();

s.setId(1);
s.setName("Royal");

session.save(s);
```

---

# Step 10: Commit Transaction

```java
tx.commit();
```

Purpose:

Permanently saves data in database.

---

# Step 11: Close Resources

```java
session.close();
factory.close();
```

Purpose:

Release memory and database connection.

---

# Running the Project

Right Click:

```text
MappingDemo.java
```

or

```text
HibernateExample.java
```

Choose:

```text
Run As
→ Java Application
```

---

# Verify Tables

Open MySQL:

```sql
USE trialhiber;

SHOW TABLES;
```

Expected:

```text
Answer
Question
author
book
Employee
Project
employee_project
student
```

---

# Verify Data

```sql
SELECT * FROM student;

SELECT * FROM Answer;

SELECT * FROM Question;
```

---

# Common Errors and Solutions

## Error

```text
The method of(Book, Book) is undefined for the type Set
```

Reason:

Java 8 does not support:

```java
Set.of(...)
```

Solution:

```java
Set<Book> books = new HashSet<>();

books.add(book1);
books.add(book2);
```

---

## Error

```text
Access denied for user 'root'
```

Solution:

Check username and password in:

```text
hibernate.cfg.xml
```

---

## Error

```text
Unknown database 'trialhiber'
```

Solution:

```sql
CREATE DATABASE trialhiber;
```

---

## Error

```text
Table doesn't exist
```

Reason:

Database not created or entity mapping missing.

---

## Error

```text
Downloading external resources is disabled
Element type must be declared
```

Reason:

Eclipse XML Validator issue.

Solution:

Ignore these warnings or disable XML validation.

---

# hbm2ddl.auto Options

|Value|Description|
|---|---|
|create|Delete old tables and create new tables|
|update|Keep data and update schema|
|create-drop|Drop tables when application exits|
|validate|Validate schema only|

Recommended:

```xml
<property name="hibernate.hbm2ddl.auto">
    update
</property>
```

---

# Successful Execution Output

```text
Hibernate ORM core version 5.6.15.Final

create table Answer
create table Question
create table author
create table book
create table Employee
create table Project
create table student

insert into Answer
insert into Question

Success
```

This confirms:

✓ Hibernate Configured Successfully

✓ MySQL Connected Successfully

✓ Tables Created Automatically

✓ Data Inserted Successfully

✓ Project Executed Successfully