# 🧸 API de Gerenciamento de Brinquedos

Este projeto foi desenvolvido como parte do **CheckPoint 2 (CP2)** da disciplina **Java Advanced** na **FIAP**.  
A aplicação consiste em uma API RESTful para cadastro e consulta de brinquedos infantis utilizando Spring Boot e Oracle Database.

## 📌 Objetivo
- Cadastrar novos brinquedos via POST
- Consultar brinquedos cadastrados via GET
- Persistência em banco Oracle
- Retorno em formato JSON

## 🛠 Tecnologias
- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Oracle Database
- Postman
- Maven

## 🗃 Estrutura do Banco
| Coluna | Tipo | Descrição |
|--------|------|-----------|
| ID_BRINQUEDO | VARCHAR2 | Chave primária UUID |
| NOME_BRINQUEDO | VARCHAR2 | Nome do brinquedo |
| TIPO_BRINQUEDO | VARCHAR2 | ELETRONICO/EDUCATIVO/OUTROS |
| CLASSIFICACAO_BRINQUEDO | VARCHAR2 | INFANTIL/JUVENIL/ADULTO |
| TAMANHO_BRINQUEDO | FLOAT | Tamanho em cm |
| PRECO_BRINQUEDO | NUMBER | Preço em R$ |

## ⚙ Configuração
`application.properties`:
```properties
spring.datasource.url=jdbc:oracle:thin:@//oracle.fiap.com.br:1521/ORCL
spring.datasource.username=SEU_RM
spring.datasource.password=SUA_SENHA
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
```

## Exemplo de JSON para o POST
```
{
    "nome": "Hot Wheels",
    "tipo": "INFANTIL",
    "classificacao": "ELETRONICO",
    "tamanho": 1.70,
    "preco": 300
}
```

## 🔌 Endpoints da API
| Método |	Endpoint |	Descrição |	Status | Code |
|--------|-----------|------------|--------|------|
| POST | /brinquedos	| Cadastra novo brinquedo	| 201 | Created |
| GET |	/brinquedos | Lista todos os brinquedos |	200 | OK |
| GET	| /brinquedos/{id} | Busca um brinquedo por ID | 200 | OK/404 | Not Found

## Dependências

<img src="https://github.com/vitorvhsilva/CP2-Spring/blob/main/assets/dependencias_maven.png">


## 📸 Screenshots

1. Spring Initializr
<img src="https://github.com/vitorvhsilva/CP2-Spring/blob/main/assets/dependencias_spring_initializer.png">
2. Post
<img src="https://github.com/vitorvhsilva/CP2-Spring/blob/main/assets/resposta_post.PNG">
3. Get All
<img src="https://github.com/vitorvhsilva/CP2-Spring/blob/main/assets/resposta_get.PNG">
4. Get By Id
<img src="https://github.com/vitorvhsilva/CP2-Spring/blob/main/assets/resposta_getid.PNG">
