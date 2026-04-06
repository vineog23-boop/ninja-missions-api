# 🥷 CadastroDeNinjas

## 📌 O que o projeto faz

O **CadastroDeNinjas** é uma API REST backend desenvolvida para gerenciamento de ninjas e missões com propósito de Aprendizagem.

A aplicação permite:

- Cadastro, listagem, atualização e remoção de ninjas
- Cadastro e listagem de missões
- Associação de missões a ninjas
- Transferência de dados via **DTOs** com mapeamento automatizado
- Persistência em banco de dados com **JPA + H2**

---

## 🚀 Tecnologias utilizadas

<p align="left">
<img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk"/>
<img src="https://img.shields.io/badge/Spring_Boot-3.4.3-brightgreen?style=for-the-badge&logo=springboot"/>
<img src="https://img.shields.io/badge/Spring_Data_JPA-blue?style=for-the-badge&logo=spring"/>
<img src="https://img.shields.io/badge/Spring_Web-darkgreen?style=for-the-badge&logo=spring"/>
<img src="https://img.shields.io/badge/H2_Database-lightblue?style=for-the-badge&logo=h2"/>
<img src="https://img.shields.io/badge/Flyway-red?style=for-the-badge&logo=flyway"/>
<img src="https://img.shields.io/badge/MapStruct-FF6F00?style=for-the-badge"/>
<img src="https://img.shields.io/badge/Lombok-8B0000?style=for-the-badge"/>
</p>

---

## ⚙️ Como instalar e rodar localmente

### 🔧 Pré-requisitos

- Java 21
- Maven

---

### 💻 Rodando localmente

```bash
git clone https://github.com/vineog23-boop/CadastroPersonagens.git
cd CadastroPersonagens
mvn clean install
mvn spring-boot:run
```

Acesse:

- API: `http://localhost:8080`
- H2 Console: `http://localhost:8080/h2-console`

---

## 📂 Estrutura do projeto

```
src/
 ├── Ninjas/
 │    ├── NinjaController.java
 │    ├── NinjaService.java
 │    ├── NinjaRepository.java
 │    ├── NinjaModel.java
 │    ├── NinjaDTO.java
 │    └── NinjaMapper.java
 └── Missoes/
      ├── MissoesController.java
      ├── MissoesRepository.java
      └── MissoesModel.java
```

---

## 🧠 Conceitos aplicados

### 🔸 Spring Data JPA
- Persistência com `@Entity`, `@Repository` e `JpaRepository`

### 🔸 DTOs + MapStruct
- Desacoplamento da camada de domínio com DTOs
- Mapeamento automático entre `NinjaModel` ↔ `NinjaDTO` via **MapStruct**

### 🔸 Relacionamento entre entidades
- Missões associadas a ninjas com `@ManyToOne` / `@OneToMany`

### 🔸 Migrations com Flyway
- Controle de versão do schema do banco via scripts SQL

### 🔸 Arquitetura em camadas
- Separação clara: **Controller → Service → Repository → Model**

---

## 👨‍💻 Autor

Projeto desenvolvido por **Vinícius Gonçalves** como parte dos estudos em **Java Backend** — FIAP Pós-Tech 🚀
