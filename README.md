# Cadastro de Ninjas API

> Observação: o repositório foi renomeado de `CadastroPersonagens` para `ninja-missions-api` para refletir melhor o conteúdo da aplicação.

API backend desenvolvida com Spring Boot para estudo de CRUD, relacionamento entre entidades, DTOs e migrations com Flyway.

## Objetivo do projeto

Este projeto foi criado para praticar conceitos importantes do desenvolvimento backend em Java, incluindo:

- modelagem de entidades
- arquitetura em camadas
- persistência com JPA
- mapeamento entre entidade e DTO
- versionamento de banco com Flyway

## Stack

<p align="left">
  <img src="https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk" alt="Java 21"/>
  <img src="https://img.shields.io/badge/Spring_Boot-3.4.3-brightgreen?style=for-the-badge&logo=springboot" alt="Spring Boot 3.4.3"/>
  <img src="https://img.shields.io/badge/Spring_Data_JPA-blue?style=for-the-badge&logo=spring" alt="Spring Data JPA"/>
  <img src="https://img.shields.io/badge/Spring_Web-darkgreen?style=for-the-badge&logo=spring" alt="Spring Web"/>
  <img src="https://img.shields.io/badge/H2-lightblue?style=for-the-badge&logo=h2" alt="H2 Database"/>
  <img src="https://img.shields.io/badge/Flyway-red?style=for-the-badge&logo=flyway" alt="Flyway"/>
  <img src="https://img.shields.io/badge/MapStruct-FF6F00?style=for-the-badge" alt="MapStruct"/>
  <img src="https://img.shields.io/badge/Lombok-8B0000?style=for-the-badge" alt="Lombok"/>
</p>

## Funcionalidades estudadas

- cadastro e listagem de ninjas
- cadastro e listagem de missões
- relacionamento entre ninjas e missões
- uso de DTOs para transferência de dados
- mapeamento automatizado entre camadas

## Configuração atual

O projeto está configurado para usar **H2** com parâmetros vindos de variáveis de ambiente.

Exemplo de configuração local:

```bash
export DATABASE_URL=jdbc:h2:mem:cadastro_ninjas
export DATABASE_USERNAME=admin
export DATABASE_PASSWORD=admin
```

No Windows PowerShell:

```powershell
$env:DATABASE_URL="jdbc:h2:mem:cadastro_ninjas"
$env:DATABASE_USERNAME="admin"
$env:DATABASE_PASSWORD="admin"
```

## Como executar

```bash
git clone https://github.com/vineog23-boop/ninja-missions-api.git
cd ninja-missions-api
mvn clean install
mvn spring-boot:run
```

A aplicação sobe por padrão em:

```
http://localhost:8080
```

Console H2:

```
http://localhost:8080/h2-console
```

## Conceitos aplicados

- arquitetura em camadas
- JPA e relacionamento entre entidades
- Flyway para versionamento do schema
- DTOs para desacoplamento da camada de domínio
- organização voltada a manutenção e clareza

## Status

Projeto de estudo em evolução, com foco em consolidar fundamentos de Spring Boot e persistência de dados.

## Autor

Desenvolvido por **Vinícius Oliveira Gonçalves** como parte dos estudos em Java backend.
