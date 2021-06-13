# ecommerce-email-api

Projeto desenvolvido como complementoto dos projetos desenvolvidos durante o livecoding da Digital Innovation One, ministrado pelo 
Daniel Hatanaka

https://github.com/hatanakadaniel/ecommerce-payment-api

https://github.com/hatanakadaniel/ecommerce-checkout-api

O projeto é uma solução de e-commerce com a arquitetura de microsserviços e aplicar a integração entre eles orientada a eventos com Apache Kafka e garantir a compatibilidade entre da comunicação dos microsserviços com Schema Registry. Para isso, a stack do Spring (Spring Boot, Spring Cloud Streams) foi utilizada.

ecommerce-email-api recebe a mensagem de pagamento efetivado, emitida pela payment-api com Apache Kafka, e notifica o cliente por email.
