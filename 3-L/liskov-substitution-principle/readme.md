# Liskov Substitution Principle (LSP) em Java

Projeto desenvolvido em Java para demonstrar, na prática, o princípio **L** do **SOLID**: **Liskov Substitution Principle** (Princípio da Substituição de Liskov).

## Objetivo

O objetivo deste exercício foi mostrar que classes filhas devem poder substituir corretamente sua classe base, sem causar comportamentos inválidos no sistema.

Neste projeto, o exemplo trabalha com aves e suas capacidades específicas, como:

- voar
- nadar

A ideia principal é evitar modelagens incorretas, como assumir que toda ave obrigatoriamente voa.

## Ideia principal do LSP

O princípio da Substituição de Liskov diz que uma classe derivada deve poder ser usada no lugar da classe base sem quebrar o funcionamento do programa.

Ou seja, se uma classe herda de outra, ela deve respeitar o comportamento esperado da abstração principal.

## Situação-problema

Em modelagens ruins de orientação a objetos, é comum criar uma classe genérica `Ave` com um método `voar()`, e depois fazer todas as aves herdarem dela.

O problema é que nem toda ave voa.

Por exemplo:
- uma águia voa
- um quero-quero voa
- um pinguim não voa, mas nada

Se o sistema obrigar toda ave a voar, então o modelo estará incorreto e violará o LSP, porque nem toda classe filha poderá substituir corretamente a classe base em todos os contextos.

## Solução aplicada

A solução adotada foi separar melhor os comportamentos.

Em vez de colocar todas as capacidades diretamente na classe `Ave`, o projeto usa interfaces específicas para representar comportamentos distintos:

- `Voavel`
- `Nadavel`

Assim:

- `Aguia` herda de `Ave` e implementa `Voavel`
- `QueroQuero` herda de `Ave` e implementa `Voavel`
- `Pinguim` herda de `Ave` e implementa `Nadavel`

Dessa forma, cada classe implementa apenas o comportamento que realmente faz sentido.

## Estrutura do projeto

- `Ave` → classe base para representar aves
- `Aguia` → ave que pode voar
- `QueroQuero` → ave que pode voar
- `Pinguim` → ave que pode nadar
- `Voavel` → interface para objetos que podem voar
- `Nadavel` → interface para objetos que podem nadar
- `Simulador` → classe responsável por simular voo e nado
- `Main` → classe principal para executar o projeto

## Explicação com minhas palavras

Antes de aplicar corretamente o LSP, seria fácil cometer o erro de criar uma hierarquia onde toda ave fosse tratada como se tivesse exatamente os mesmos comportamentos.

Isso causaria problema porque algumas aves possuem características diferentes.

Com a solução adotada:

- a classe `Ave` representa apenas o conceito geral de ave
- o comportamento de voar foi separado na interface `Voavel`
- o comportamento de nadar foi separado na interface `Nadavel`
- cada classe concreta implementa apenas o que realmente pode fazer

Assim, o código fica mais coerente com a realidade e respeita melhor o princípio da substituição.

## Como o projeto aplica o LSP

O sistema não força todas as aves a executarem comportamentos inválidos.

Em vez disso:
- aves que voam são usadas em simulações de voo
- aves que nadam são usadas em simulações de nado

Isso evita que uma classe filha herde comportamentos que não fazem sentido para ela.

## Vantagens dessa abordagem

- evita heranças mal planejadas
- reduz comportamentos inválidos
- melhora a modelagem orientada a objetos
- deixa o código mais organizado
- respeita melhor o princípio da substituição de Liskov

## Tecnologias utilizadas

- Java
- IntelliJ IDEA

## Como executar

1. Abra o projeto na IDE
2. Execute a classe `Main.java`
3. Veja no console as simulações de voo e nado

## Conclusão

Este exercício demonstra como o **Liskov Substitution Principle** ajuda a construir hierarquias de classes mais corretas e coerentes.

Ao separar comportamentos específicos em interfaces, o sistema evita generalizações erradas e garante que cada classe concreta seja usada apenas nos contextos em que realmente faz sentido.

## Referência da atividade

Documento da atividade proposta pelo professor:  
https://docs.google.com/document/d/1e4onF-XP0XNpzmR--80Sg8SpHof5o4rdt-fsvkPdOy4/edit?tab=t.0
