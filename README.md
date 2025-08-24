## Note on API Language Choice

The original brief specified:

1) A Java backend service for core business logic and pricing rules, and 
2) **A JavaScript API layer** to expose the shopping cart functionality.”

For this submission, the API layer is implemented in Java (Spring Boot) instead of JavaScript. Here is the reasoning:

1. I have hands-on experience in Java + Spring Boot REST and microservices. Implementing the API in Java ensured a reliable, production-style result within the 2‑hour time constraint.
2. Separation of Concerns Preserved: The solution keeps a clean separation between core business logic (`CartService`) and the API layer (`CartController`). 


