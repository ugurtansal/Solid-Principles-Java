# Solid-Principles-Java

This repository contains a **Java** project designed to help you understand the **SOLID** principles more easily.

---

## What is a SOLID?

**SOLID** is an acronym formed from the initials of five fundamental object-oriented software development principles. These principles are:

 **S** - Single Responsibility Principle 
 
 **O** - Open/Closed Principle 
 
 **L** - Liskov Substitution Principle
 
 **I** - Interface Segregation Principle 
 
 **D** - Dependency Inversion Principle 

We will see these principles in action with a simple example in Java.


---

### **1️⃣ S - Single Responsibility Principle (SRP)**  
> **A class should have only one reason to change.**  
> **Each class should focus on a single responsibility to reduce complexity and improve maintainability.**  

Example:
In our case, if the Order class handles both order management and invoice printing, it violates the SRP.

✅ Correct Approach:
We separate order processing into the Order class and invoice printing into the InvoicePrinter class.

---

### **2️⃣ O - Open/Closed Principle (OCP)**  
> A class should be open for extension but closed for modification.
> You should be able to add new functionality without modifying existing code, typically achieved through inheritance or interfaces.

Example:
In our case, we use the PaymentMethod interface to support multiple payment methods.

✅ This way, we can add new payment methods without modifying the existing code.

---

### **3️⃣ L - Liskov Substitution Principle (LSP)**  
> Every subclass should be substitutable for its base class.
> A subclass should remain compatible with the behavior of its superclass.

Example:
If the CashPayment class implements the PaymentMethod interface but does not support some required methods, it violates the Liskov Substitution Principle.

✅ All payment methods should properly implement the PaymentMethod interface.

---

### **4️⃣ I - Interface Segregation Principle (ISP)**  
> Try to make your interfaces as specific as possible so that client classes do not have to implement methods they don’t need.

Example:
If all payment methods implement the RefundablePayment interface, but some do not support refunds, then ISP is violated.

✅ We create a separate interface for refundable payments so that only applicable payment methods implement it.

---

### **5️⃣ D - Dependency Inversion Principle (DIP)**  
> High-level modules should not depend on low-level modules. Instead, they should depend on abstractions.

Example:
If OrderService directly depends on CreditCardPayment, it violates the Dependency Inversion Principle.

✅ The OrderService class should depend on the PaymentMethod interface, allowing easy integration of new payment methods.

---

## **Advantages of Applying SOLID Principles**

✅ Modularity: New payment methods or order processing features can be added easily.

✅ Maintainability: We do not need to modify the entire code when making changes.

✅ Testability: Since dependencies rely on abstractions (interfaces), unit testing becomes easier.


