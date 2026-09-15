# User & Department Management API

API REST desenvolvida com Java e Spring Boot para gerenciamento de usuários e seus respectivos departamentos, utilizando banco de dados em memória H2 e Spring Data JPA.

---

## 🛠️ Tecnologias Utilizadas

* **Java 17** (ou versão correspondente ao projeto)
* **Spring Boot**
* **Spring Data JPA** / Hibernate
* **Spring Web**
* **H2 Database** (em memória)
* **Maven** (ou Gradle)

---

## 🚀 Funcionalidades & Endpoints

| Método | Rota | Descrição |
| :--- | :--- | :--- |
| `GET` | `/users` | Lista todos os usuários |
| `GET` | `/users/{id}` | Busca um usuário por ID |
| `POST` | `/users` | Cadastra um novo usuário e associa a um departamento |

---

## 💻 Como Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/aleroberto/user-dept-api.git](https://github.com/aleroberto/user-dept-api.git)
   cd user-dept-api
