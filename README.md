# User & Department Management API

API REST desenvolvida com **Java e Spring Boot** para gerenciamento de usuários e departamentos, utilizando **Spring Data JPA**, **Hibernate** e **H2 Database** para persistência em memória.

O projeto demonstra a implementação de uma API REST com operações de consulta e cadastro, modelagem de entidades e relacionamento entre usuários e departamentos.

---

## 🛠️ Tecnologias

* **Java 17**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **Hibernate**
* **H2 Database**
* **Maven**

---

## 📌 Funcionalidades

A API permite:

* Consultar todos os usuários cadastrados
* Consultar um usuário pelo ID
* Cadastrar novos usuários
* Associar usuários a departamentos
* Persistir os dados utilizando JPA/Hibernate
* Inicializar dados da aplicação por meio do `import.sql`

---

## 🔌 Endpoints

| Método | Rota          | Descrição                                            |
| :----- | :------------ | :--------------------------------------------------- |
| `GET`  | `/users`      | Lista todos os usuários                              |
| `GET`  | `/users/{id}` | Busca um usuário pelo ID                             |
| `POST` | `/users`      | Cadastra um novo usuário e associa a um departamento |

---

## 🗂️ Estrutura do Projeto

```text
src/
├── main/
│   ├── java/com/aleroberto/userdept/
│   │   ├── controllers/
│   │   │   └── UserCntroller.java
│   │   ├── entities/
│   │   │   ├── Department.java
│   │   │   └── User.java
│   │   ├── repositories/
│   │   └── UserdeptApplication.java
│   │
│   └── resources/
│       ├── application.properties
│       └── import.sql
│
└── test/
```

A aplicação utiliza entidades JPA para representar usuários e departamentos, com acesso aos dados por meio do Spring Data JPA.

---

## 💻 Como executar

### 1. Clone o repositório

```bash
git clone https://github.com/aleroberto/spring-boot-user-management.git
cd spring-boot-user-management
```

### 2. Execute a aplicação

Com o Maven Wrapper:

**Linux/macOS**

```bash
./mvnw spring-boot:run
```

**Windows**

```cmd
mvnw.cmd spring-boot:run
```

A aplicação será iniciada localmente conforme a configuração definida em `application.properties`.

---

## 🗄️ Banco de dados

O projeto utiliza o **H2 Database em memória**, configurado para uso durante a execução da aplicação.

Os dados iniciais são carregados a partir do arquivo:

```text
src/main/resources/import.sql
```

Por utilizar um banco em memória, os dados não são mantidos após o encerramento da aplicação.

---

## 📚 Objetivo do projeto

Projeto desenvolvido para praticar conceitos de desenvolvimento backend com **Java e Spring Boot**, incluindo:

* Desenvolvimento de APIs REST
* Modelagem de entidades
* Relacionamentos entre entidades
* Persistência com JPA/Hibernate
* Uso do Spring Data JPA
* Operações de acesso a dados
* Configuração de banco de dados H2
* Organização de uma aplicação Spring Boot

---

## 📄 Observação

Este é um projeto de estudo e portfólio, desenvolvido com dados de exemplo.
