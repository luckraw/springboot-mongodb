# Projeto Spring Boot com MongoDB

Este é um projeto Spring Boot que utiliza o MongoDB como banco de dados para armazenar informações sobre pessoas (`Person`) e fotos (`Photo`). O projeto inclui controllers, repositórios, serviços e suas implementações para manipular essas entidades.

## Entidades

### Person

A entidade `Person` representa uma pessoa e possui os seguintes atributos:

- `id`: Identificador único da pessoa.
- `firstName`: Primeiro nome da pessoa.
- `lastName`: Sobrenome da pessoa.
- `age`: Idade da pessoa.
- `hobbies`: Lista de hobbies da pessoa.
- `addresses`: Lista de endereços associados à pessoa, onde cada endereço é representado por uma instância da classe `Address`.

### Address

A classe `Address` representa um endereço e possui os seguintes atributos:

- `address1`: Primeira linha do endereço.
- `address2`: Segunda linha do endereço.
- `city`: Cidade do endereço.

### Photo

A entidade `Photo` representa uma foto e possui os seguintes atributos:

- `id`: Identificador único da foto.
- `title`: Título da foto.
- `photo`: Dados binários da foto.

## Controllers

### PersonController

O `PersonController` gerencia operações relacionadas à entidade `Person`. Alguns endpoints incluem:

- `POST /person`: Cria uma nova pessoa.
- `GET /person?name={name}`: Retorna uma lista de pessoas cujo nome começa com o valor fornecido.
- `DELETE /person/{id}`: Exclui a pessoa com o ID especificado.
- `GET /person/age?minAge={minAge}&maxAge={maxAge}`: Retorna pessoas com idade entre os valores fornecidos.
- `GET /person/search?name={name}&minAge={minAge}&maxAge={maxAge}&city={city}&page={page}&size={size}`: Realiza uma pesquisa detalhada com opções de paginação.

### PhotoController

O `PhotoController` gerencia operações relacionadas à entidade `Photo`. Alguns endpoints incluem:

- `POST /photo?image={image}`: Adiciona uma nova foto usando um arquivo de imagem.
- `GET /photo/{id}`: Baixa uma foto específica com o ID fornecido.

## Repositórios/Interfaces

### PersonRepository

O `PersonRepository` define operações de acesso a dados para a entidade `Person`, como encontrar pessoas pelo nome ou idade.

### PhotoRepository

O `PhotoRepository` define operações de acesso a dados para a entidade `Photo`.

## Services

### PersonService

O `PersonService` fornece serviços relacionados à entidade `Person`, como salvar, buscar e excluir pessoas, além de operações específicas, como encontrar a pessoa mais idosa em uma cidade.

### PhotoService

O `PhotoService` fornece serviços relacionados à entidade `Photo`, como adicionar e obter fotos.

## Services Implementation

### PersonServiceImpl

O `PersonServiceImpl` implementa os serviços definidos em `PersonService` utilizando o `PersonRepository` e o `MongoTemplate` para interações com o MongoDB.

### PhotoServiceImpl

O `PhotoServiceImpl` implementa os serviços definidos em `PhotoService` utilizando o `PhotoRepository` para interações com o MongoDB.

## Documentação e Teste de API com SpringDoc e SwaggerUI.
Acesse a documentação da API gerada automaticamente usando o Swagger:

http://localhost:8080/swagger-ui.html

