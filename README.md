# CORBA Banking System

A demonstration of CORBA (Common Object Request Broker Architecture) implementation using Java, showcasing a simple banking transaction system with client-server architecture.

## 🌟 Features

- Basic banking operations (deposit, withdraw, balance check)
- Client-Server architecture using CORBA
- Java implementation with IDL interface
- Cross-platform compatibility

## 📋 Prerequisites

- Java Development Kit (JDK) 8 or higher
- CORBA implementation (comes with JDK)
- IDE that supports Java (Eclipse, IntelliJ IDEA, etc.)

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/YourUsername/BankCorbaAndroid.git
cd BankCorbaAndroid
```

### 2. Generate CORBA Classes
Generate the necessary Java files from the IDL definition:

```bash
idlj -fall bank.idl
```
This will create several Java files in the Bank directory.

### 3. Compile the Project
```bash
javac *.java Bank/*.java
```
### 4. Running the Application
Start the CORBA naming service:
```bash
orbd -ORBInitialPort 1050
```
In a new terminal, start the server:
```bash
java TransactionServer -ORBInitialPort 1050 -ORBInitialHost localhost
```
In another terminal, run the client:
```bash
java TransactionClient -ORBInitialPort 1050 -ORBInitialHost localhost
```
[Previous sections remain the same...]

## 🔍 Project Components

1. **TransactionServer**
   * Implements the server-side logic
   * Handles all banking operations
   * Manages client connections

2. **TransactionClient**
   * Provides client interface for banking operations
   * Connects to the server
   * Executes user transactions

3. **bank.idl**
   * Defines the interface between client and server
   * Specifies available banking operations
   * Core contract for CORBA communication

4. **Generated CORBA Classes**
   * Handle communication between client and server
   * Generated automatically from bank.idl
   * Provide necessary CORBA infrastructure

## ⚠️ Common Issues and Solutions

### 1. NameServer Connection Failed
* ❌ **Problem**: Server cannot be reached
* ✅ **Solutions**:
  * Start ORBD service: `orbd -ORBInitialPort 1050`
  * Use correct port (1050)
  * Use correct hostname (localhost)

### 2. Compilation Errors
* ❌ **Problem**: Code won't compile
* ✅ **Solutions**:
  * Set CLASSPATH to include current directory
  * Generate CORBA classes: `idlj -fall bank.idl`
  * Use compatible JDK version
