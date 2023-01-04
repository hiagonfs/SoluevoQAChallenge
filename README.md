## Soluevo QA Challenge

Desafio de automação Soluevo.

#### Documentação e regras 

As regras da aplicação encontram-se [aqui](https://github.com/david-coca/SoluevoQAChallenge). 

#### Requisitos

Para a execução do projeto é necessário possuir:
- [Maven](https://maven.apache.org/) 
- [Java 1.8 ou +](https://www.java.com/pt-BR/) 

## Instalando as dependências 

```bash
  mvn package
```

##### Execução

Para execução do projeto navegue até a pasta raiz com um terminal de sua preferência e utilize o comando:

`$ mvn exec:java -Dexec.mainClass="src.test.java.main.MainRunner"`

O comando acima irá executar a classe Mainq que contém a chamada ao Cucumber. 

Nota: 

Caso queira também é possível executar utilizando a própria IDE de sua preferência, navegando até a classe Main e utilizando o comando 'Run'.

Preferi utilizar composição ao invés de herança, deixando assim o acoplamento menor.

## Estrutura de diretórios:

- src: código fonte com a implementação
- reports: imagens capturadas durante a execução

## Tecnologias utilizadas:
```bash
- Maven
- Java
- JUnit
- Cucumber
- Selenium WebDriver
```



