# Dependency Inversion Principle (DIP) em Java

Projeto desenvolvido em Java para demonstrar, de forma simples, o princípio **D** do **SOLID**: **Dependency Inversion Principle**.

## Objetivo

O objetivo deste projeto é mostrar que classes de alto nível não devem depender diretamente de classes concretas, mas sim de abstrações.

Com isso, o código fica mais flexível, organizado e fácil de manter.

## Ideia principal

O princípio da inversão de dependência diz que o sistema deve depender de interfaces ou abstrações, e não diretamente de implementações específicas.

Dessa forma, é possível trocar uma implementação por outra sem precisar alterar toda a estrutura do código.

## Solução aplicada

Neste projeto, a lógica principal utiliza uma interface para representar a dependência, evitando que uma classe fique presa a uma implementação concreta.

Assim, novas classes podem ser adicionadas futuramente sem causar grandes mudanças no código já existente.

## Tecnologias utilizadas

* Java
* IntelliJ IDEA
* Programação Orientada a Objetos
* Princípios SOLID

## Como executar

1. Abra o projeto na IDE.
2. Execute a classe `Main.java`.
3. Veja no console o funcionamento do exemplo.

## Conclusão

Este exercício mostra como o Dependency Inversion Principle ajuda a reduzir o acoplamento entre as classes.

Ao depender de abstrações, o código fica mais fácil de alterar, testar e evoluir.

## Referência da atividade

https://docs.google.com/document/d/1bIgIvja7sGHR6jdFxtC_GKu2rHZcPomdf-uvsN4RJzU/edit?usp=sharing
