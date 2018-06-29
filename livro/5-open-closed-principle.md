# Open/Closed Principle

> **Deve ser possível estender o comportamento de uma classe sem modificá-la.**
> Uncle Bob

## Ideias

Polimorfismo

Variações Protegidas

Anti-if Campaign

## Técnicas

Design Pattern: Strategy

## Citações

> _Objetos têm um mecanismo fabuloso, mensagens polimórficas, que permitem expressar lógica condicional de maneira flexível mas clara. Ao trocar condicionais explícitos por mensagens polimórficas, muitas vezes você consegue reduzir duplicação, tornar seu código mais claro e aumentar a flexibilidade tudo ao mesmo tempo._
> Kent Beck

> _Identifique pontos previstos de variação e crie uma interface estável em torno deles._
> Craig Larman

> _Módulos devem ser abertos (para extensão e adaptação) e fechados (para evitar modificação e afetar clientes)._
> Bertrand Meyer

> _Devemos escrever módulos que podem ser estendidos sem que sejam modificados._
> _Mudar o que os módulos fazem ser mudar o seu código fonte._
> Uncle Bob

> _Strategy: encapsular uma família de algoritmos intercambiáveis em objetos com um contrato comum_
> Alexandre Aquiles

> _O Open/Closed Principle é o objetivo de uma arquitetura Orientada a Objetos._
> _O Dependency Inversion Principle é o seu mecanismo fundamental._
> Uncle Bob

> _Encontrar os pontos onde sua modelagem precisa ser flexível e onde não precisa é um desafio._
> Maurício Aniche

> _Evite os perigosos IFs e use Objetos para construir código flexível, facilmente modificável e testável e que vai ajudar a evitar muitas dores de cabeça e fins de semana debugando!_
> Francesco Cirillo

## Referências

1. Post [The Principles of OOD](http://butunclebob.com/ArticleS.UncleBob.PrinciplesOfOod), Uncle Bob, 2005

2. Livro [Refactoring](https://www.amazon.com/Refactoring-Improving-Design-Existing-Code/dp/0201485672/), Martin Fowler et al, 1999

3. Artigo [Protected Variation](https://www.martinfowler.com/ieeeSoftware/protectedVariation.pdf), Craig Larman, 2001

4. Livro [Object-Oriented Software Construction](https://www.amazon.com/Object-Oriented-Software-Construction-Book-CD-ROM/dp/0136291554), Bertrand Meyer, 1988

5. Artigo [Design Principles and Design Patterns](http://www.cvc.uab.es/shared/teach/a21291/temes/object_oriented_design/materials_adicionals/principles_and_patterns.pdf), Uncle Bob, 2000

6. Post [Evitando duplicação com Strategy e Classes Anônimas](https://alexandreaquiles.com.br/2014/03/19/evitando-duplicacao-com-strategy-e-classes-anonimas/), Alexandre Aquiles, 2014

7. Livro [OO e SOLID para Ninjas](https://www.casadocodigo.com.br/products/livro-oo-solid), Maurício Aniche, 2015

8. Site [Anti-IF Campaign](https://francescocirillo.com/pages/anti-if-campaign), Francesco Cirillo
