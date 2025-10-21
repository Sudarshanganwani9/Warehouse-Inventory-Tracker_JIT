# 🏭 Warehouse Inventory Tracker (JIT System)

This project is a **Warehouse Inventory Tracker** based on the **Just-In-Time (JIT)** inventory management concept.  
It helps manage stock levels, track products, and trigger alerts when inventory falls below the required threshold.

---

## 📋 Features

- 📦 Add, update, and manage warehouse products.
- 📊 Track current stock levels in real-time.
- 🔔 Automatic stock alerts when items are below the minimum threshold.
- ⚙️ Demonstrates Just-In-Time (JIT) inventory logic.
- 🧮 Simple Java-based implementation for learning and demonstration.

---

## 🧠 Project Structure

Warehouse-Inventory-Tracker_JIT-main/ ├── src/ │   ├── Main.java               # Entry point of the application │   ├── Product.java            # Product model class │   ├── Warehouse.java          # Warehouse management logic │   ├── AlertService.java       # Alert generator for low stock │   ├── StockAlertService.java  # Handles stock-level monitoring └── README.md                   # Project documentation

---

## 🚀 How to Run

### 🔧 Prerequisites
- Install **Java JDK 8 or above**
- Ensure `javac` and `java` are available in your terminal

### 💻 Steps
1. Open a terminal inside the project folder:

Warehouse-Inventory-Tracker_JIT-main/Warehouse-Inventory-Tracker_JIT-main/

2. Compile the project:
```bash
javac -d out src/*.java

3. Run the program:

java -cp out Main




---

### 📘 Example Output

=== Warehouse Inventory Tracker ===
Added product: Laptop (Stock: 10)
Added product: Keyboard (Stock: 5)
Low stock alert! Keyboard has only 2 items left.
Restocking Keyboard...
Updated stock: 10


---

### 🧩 Concepts Demonstrated

Object-Oriented Programming (OOP)

Inventory management principles

Just-In-Time (JIT) approach

Alert services and modular Java design



---

### 👨‍💻 Author

Sudarshan Ganwani
📅 Project for demonstration and learning
📍 Built using Java
