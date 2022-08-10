# Lojinha API Automação
Esse é um repositório que contém a automação de alguns testes de API Rest do software denominado Lojinha. Esse software foi utilizado durante os testes feitos no curso Programa de Testes e Qualidade de Software, ministrado pelo Júlio de Lima.

## Tecnologias utilizadas
- Java
- JUnit
- RestAssured
- Maven

## Testes automatizados
Testes para validar as partições de equiavalência relacionadas ao valor do produto na Lojinha, que estão vinculados diretamente a regra de negócio que diz que o valor do produto deve estar entre R$ 0,01 e R$ 7.000,01.

## Notas gerais
- Sempre utilizamos a anotação Before Each para capturar o token que será utilizado posteriormente nos métodos de teste.
- Armazenamos os dados que são enviados para a API através do uso de classes POJO;
- Criamos dados inicias, atravez de classes Data Factory, para facilitar a criação e controle;
- Nesse projeto fazemos uso do JUnit 5 o que nos dá a possibilidade de usar a anotação DisplayName para dar descrições em português para nossos testes.

## IDE utilizada
- IntelliJ