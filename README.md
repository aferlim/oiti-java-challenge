# Desafio Oiti - Java Developer

## Introdução

O objetivo deste desafio é avaliar os seus conhecimentos em arquitetura de código, raciocínio lógico, _clean code_ e modelagem de dados.

## Caso de Uso

Como negócio precisamos que seja desenvolvida uma api para controle de tarefas pessoais de cada usuário.
O usuários podem ver suas atividades mediante autenticação na API.

## Requisitos funcionais

Por favor, baixe este repositório: queremos avaliar sua estratégia de resolução de alguns problemas contidos no projeto.

- 1. Deverá conter um endpoint para cadastro de um usuário:
  - Path: Post - /api/user
  - Corpo da requisição (JSON):
    - login (string, campo único por usuário, não pode ser vazio ou nulo)
    - password (string, deve conter no mínimo, 8 caracteres, ao menos uma letra maiúscula, um número e um caracter especial)
    - email (string, dever ser um email válido)
    - name (string, não pode ser vazio ou nulo)
    - bithDate (date, data válida, +18)
- 2. Deverá conter um endpoint para autenticação utilizando JWT
  - Path: Post - /api/auth
  - Corpo da requisição (JSON):
    - username (login)
    - password
  - Corpo da resposta (JSON):
    - token
- 3. Deverá conter um endpoint para verificar se o usuário está autenticado, retornar nome e id
  - Path: GEt - /api/auth
  - Headers:
    - Authorization: bearer token
  - Corpo da resposta:
    - userId
    - name
- 4. Deverá conter um endpoint para criar uma tarefa
  - Path: Post - /api/task
  - Headers:
    - Authorization: Bearer token
  - Corpo da requisição (JSON):
    - date (datetime, obrigatório)
    - done (boolean, obrigatório)
    - description (string, obrigatório, não pode ser vazio ou nulo)
  - Corpo da resposta (JSON)
    - id
    - date
    - done
    - description
- 5. Deverá conter um endpoint para atualizar uma tarefa
  - Path: Put - /api/task/:taskId
  - Headers:
    - Authorization: Bearer token
  - Corpo da requisição (JSON):
    - date (datetime, obrigatório)
    - done (numeric, maior ou igual a zero, obrigatório)
    - description (string, obrigatório, não pode ser vazio ou nulo)
  - Corpo da resposta (JSON)
    - id
    - date
    - done
    - description
- 6. Deverá conter um endpoint para buscar tarefa apenas do usuário
  - Path: Get - /api/task
  - Query:
    - description (opcional)
    - date (opcional)
    - income (opcional)
    - outflow (opcional)
  - Headers:
    - Authorization: Bearer token
  - Corpo da resposta (JSON)
    - records (array de transações)
      - id
      - date
      - done
      - description
    - recordsTotal (number)
    - pageNumber (number)
    - pageSize (number)
- 7. Deverá conter um endpoint para buscar uma tarefa específica, desde que do usuário
  - Path: Get -> /api/task/:taskId
  - Headers:
    - Authorization: Bearer token
  - Corpo da resposta (JSON)
    - id
    - date
    - done
    - description
- 8. Deverá conter um endpoint para remover uma tarefa do usuário
  - Path: Delete -> /api/task/:taskId
  - Headers:
    - Authorization: Bearer token
- 9. Utilizar Docker, caso o bando de dados escolhido seja o PostgreSql
  - Criar um readme com informações suficientes para rodar e testar a aplicação.

## Requisitos não funcionais

- Java 11
- Spring Boot
- JPA
- PostgreSql ou H2 Database
- Docker

## Final

Após a avaliação, os seus resultados serão encaminhados de volta para a equipe técnica, e eles irão dar continuidade ao seu processo seletivo juntamente com o RH da Oiti.
​
