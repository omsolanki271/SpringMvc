# 🚀 Spring Web MVC Learning Project

## 📌 Overview

This is a **Spring Web MVC based web application** that demonstrates the complete flow of:

* MVC Architecture
* Request Handling
* Form Submission
* Data Binding using `@ModelAttribute`
* View Rendering using JSP

This project is created for **learning + interview preparation** and covers core concepts of Spring MVC.

---

## 🧠 Key Concepts Covered

* DispatcherServlet (Front Controller)
* HandlerMapping
* Controller (Request Handling)
* Model & ModelAndView
* ViewResolver
* JSP (View Layer)
* Form Handling
* Data Binding using `@ModelAttribute`

---

## 🏗️ Project Structure

```
SpringMVC/
│
├── src/
│   ├── com.springmvc.controller/
│   │   └── MyController.java
│   │
│   ├── com.spring.bean/
│   │   └── User.java
│
├── WEB-INF/
│   ├── web.xml
│   ├── spring-servlet.xml
│   └── views/
│       ├── hello.jsp
│       ├── about.jsp
│       ├── my-form.jsp
│       └── profile.jsp
│
├── index.jsp
└── pom.xml
```

---

## ⚙️ Technologies Used

* Java
* Spring Web MVC
* JSP (Java Server Pages)
* Servlet API
* Apache Tomcat
* Maven

---

## 🔄 Application Flow

```
Client Request
     ↓
DispatcherServlet (Front Controller)
     ↓
HandlerMapping
     ↓
Controller
     ↓
Model + View
     ↓
ViewResolver
     ↓
JSP Page
     ↓
Response to Client
```

---

## 🧩 Important Code Snippets

### 🔹 Controller Example

```java
@PostMapping("/submitForm")
public String handleMyform(@ModelAttribute User user) {
    return "profile";
}
```

### 🔹 View Resolver

```xml
<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
    <property name="prefix" value="/WEB-INF/views/" />
    <property name="suffix" value=".jsp" />
</bean>
```

### 🔹 Form Example

```html
<form action="submitForm" method="post">
    <input type="text" name="uname">
    <input type="email" name="email">
    <input type="text" name="mobileno">
</form>
```

---

## 💡 Learning Outcome

After completing this project, I understood:

* Complete Spring MVC Architecture
* Request flow inside Spring
* Form handling in web applications
* Importance of annotations
* Data binding techniques

---

## 🎯 Purpose

This project is created for **learning Spring MVC basics and interview preparation**.

---

## 👨‍💻 Author

**Om Solanki**  
Java Developer | Spring MVC Learner  
Passionate about backend development and building web applications.






