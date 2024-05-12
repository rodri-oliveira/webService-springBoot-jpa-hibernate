### EM DESENVOLVIMENTO

# Projeto Back-End

Este é um projeto desenvolvido com o intuito de aplicar e treinar os conceitos back-end com Java e Spring Boot. 
Ele oferece uma base sólida para compreender os principais conceitos e tecnologias empregadas no desenvolvimento de aplicativos web e APIs RESTful.

## Objetivos de Aprendizagem

- Compreender os conceitos fundamentais do Spring Boot, como inversão de controle e injeção de dependência.
- Aprender a criar e mapear entidades JPA com Spring Data JPA e Hibernate.
- Entender como desenvolver endpoints RESTful para manipulação de recursos.
- Explorar o uso de bancos de dados relacionais, como MySQL e H2 Database, em aplicações Java.

## Tecnologias Utilizadas

- ![Spring Boot](https://img.shields.io/badge/Spring_Boot-green)
- ![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-green)
- ![Hibernate](https://img.shields.io/badge/Hibernate-green)
- ![MySQL](https://img.shields.io/badge/MySQL-blue)
- ![H2 Database](https://img.shields.io/badge/H2_Database-blue)
- ![Maven](https://img.shields.io/badge/Maven-red)
- ![Java](https://img.shields.io/badge/Java-orange)

## Configuração

1. Certifique-se de ter o Java JDK 11 e o Maven 3.x instalados em sua máquina.
2. Clone este repositório.
3. Navegue até o diretório raiz do projeto.
4. Execute `mvn spring-boot:run` para iniciar a aplicação.
5. Acesse `http://localhost:8082` para interagir com a API.

## Endpoints Disponíveis

### Users

- `GET /users`: Retorna todos os usuários.
- `GET /users/{id}`: Retorna um usuário por ID.

### Products

- `GET /products`: Retorna todos os produtos.
- `GET /products/{id}`: Retorna um produto por ID.

### Orders

- `GET /orders`: Retorna todas as ordens.
- `GET /orders/{id}`: Retorna uma ordem por ID.

### Categories

- `GET /categories`: Retorna todas as categorias.
- `GET /categories/{id}`: Retorna uma categoria por ID.
