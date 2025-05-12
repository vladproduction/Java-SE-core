# Java OOP Concepts Overview

This project provides a brief overview of Object-Oriented Programming (OOP) principles and key Java concepts. It is ideal for learners aiming to build a strong foundation in Java's core features.

---

## 📌 Topics Covered

### 1. ✅ Advantages of Java
- **Simple & familiar**: Easy to learn if you're familiar with C++.
- **Object-Oriented**: Follows the OOP paradigm.
- **Secure**: Runtime checking, bytecode verification, and built-in security APIs.
- **Platform-Independent**: Java bytecode runs on any system with a JVM.

### 2. 🌍 Cross-Platform Nature
- **Write Once, Run Anywhere (WORA)** is enabled by compiling to bytecode that runs on any compliant Java Virtual Machine (JVM).

### 3. 🧱 OOP in Java
- **Encapsulation**: Wrapping data with methods.
- **Inheritance**: Reusing code through class hierarchies.
- **Polymorphism**: Ability to take many forms via method overloading/overriding.
- **Abstraction**: Hiding implementation details.

### 4. 🔐 Access Modifiers
- `public`: Accessible everywhere.
- `protected`: Accessible in the same package and subclasses.
- `default` (package-private): Accessible in the same package.
- `private`: Accessible only within the same class.

### 5. 🔒 `final` and Immutability
- `final` prevents reassignment or overriding.
- Immutable classes (e.g., `String`) don't allow state change after creation.

### 6. 🧩 Abstraction
- Hides internal implementation.
- Achieved using **abstract classes** and **interfaces**.

### 7. 🆚 Abstract Classes vs Interfaces
| Feature             | Abstract Class         | Interface                  |
|---------------------|------------------------|----------------------------|
| Inheritance         | Single inheritance     | Multiple inheritance       |
| Method implementation | Can have some methods implemented | All methods abstract (Java < 8) |
| Constructors        | Yes                    | No                         |

### 8. ⚙️ `static` Keyword
- Belongs to the class, not instance.
- Used for constants, utility methods, and static blocks.

### 9. 🧠 `equals()`, `hashCode()`, `==`
- `==`: Compares references.
- `equals()`: Compares object content.
- `hashCode()`: Consistent with `equals()` for hash-based collections.

### 10. 📦 Parameter Passing
- Java is **pass-by-value**.
- Object references are passed by value (i.e., the reference value itself).

### 11. 💡 String and Integer Pools
- **String Pool**: Interned strings stored to optimize memory.
- **Integer Pool**: Values from -128 to 127 are cached for reuse.

### 12. ♻️ Garbage Collector
- Automatically manages memory.
- Frees memory by destroying unreachable objects.

### 13. 🧩 ClassLoader
- Loads classes into memory.
- Types: **Bootstrap**, **Extension**, and **Application** class loaders.

### 14. 🔐 Java Security
- Java provides built-in mechanisms:
    - Bytecode verification
    - SecurityManager and policies
    - Sandboxing (esp. for applets)
    - Cryptography APIs

---

## 📘 Recommended For
- Beginners in Java
- Interview preparation
- OOP concept revision

---

## 📎 License
This project is open-source and free to use.