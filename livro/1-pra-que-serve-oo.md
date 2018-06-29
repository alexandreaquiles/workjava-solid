# Pra quê serve OO?

Você aprendeu Orientação a Objetos.

Saca tudo de classes, objetos, atributos, métodos, herança, polimorfismo, interfaces.

Aprendeu algumas soluções comuns para problemas recorrentes estudando Design Patterns.

Mas pra que usar OO?

Sem dúvida, a resposta tem a ver com organizar e facilitar a mudança do código no médio/longo prazo.

Mas, mais especificamente, há 2 abordagens complementares:

- pra criar um **modelo** do mundo real
- para gerenciar as **dependências** do seu código

OO é uma ótima ferramenta para representar, em código, os conceitos do problema que estamos resolvendo. É importante selecionar entidades de negócio e criar um modelo de domínio que as "traduza" para uma linguagem de programação. Um bom _domain model_ é o foco de metodologias como Feature-Driven Development e técnicas como Domain-Driven Design, Card-Responsibility-Collaboration e GRASP.

Mas OO também é uma ótima maneira de evitar código "amarrado" demais, controlando as dependências e minimizando o acoplamento. Um código OO bem modelado, com as dependências administradas com cuidado, leva a mais flexibilidade, robustez e possibilidade de reuso. Dependências bem gerenciadas são o foco de técnicas como Design Patterns, Dependency Injection e o que vamos estudar com calma: os **Princípios SOLID**.

1. **S**ingle Responsibility Principle: _objetos coesos_ 
2. **O**pen/Closed Principle: _objetos flexíveis_
3. **L**iskov Substitution Principle: _herança do jeito certo_
4. **I**nterface Segregation Principle: _sem dependências inúteis_
5. **D**ependency Inversion Principle: _dependências organizadas_

## Referências

1. Página sobre [princípios de OO](http://butunclebob.com/ArticleS.UncleBob.PrinciplesOfOod) do wiki do Uncle Bob
