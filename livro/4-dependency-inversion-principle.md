# Dependency Inversion Principle

O _Princípio da Inversão de Dependências_:

> **Dependa de abstrações, não de implementações.**
> Uncle Bob

ou

> **Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações.**
> **Abstrações não devem depender de detalhes. Detalhes devem depender de abstrações.**
> Uncle Bob

## Ideias

Dependências == Acoplamento

Os Mecanismos de Entrega mudam... As Regras de Negócio continuam!

O problema é Regras de Negócio dependeram de Mecanismos de Entrega (detalhes)
Uma mudança em qualquer um dos Mecanismos de Entrega levará a uma mudança no código de Negócio

VOLÁTIL: Pouco firme; inconstante, mudável, volúvel.

Implementações são voláteis. Abstrações são (mais) estáveis

Alto Nível == Regras de Negócio
Baixo Nível == Mecanismos de Entrega

ACOPLAMENTO BOM: classes estáveis.

## Técnicas

Design Pattern: Factory Method

A REGRA DA DEPENDÊNCIA

## Citações

> _Programe voltado à interface, não à implementação_
> Gamma & Helm & Johnson & Vlissides

> _Um dos lugares mais comuns que os projetos dependem de classes concretas é quando esses projetos criam instâncias._
> Uncle Bob

> _Os design patterns do mundo do software, cuja ideia originou-se da arquitetura de prédios, são uma coleção de soluções comuns para problemas recorrentes. Não são normas de planos, nem moldes de planos. Também não são normas de modelagem. Design patterns são moldes de modelagem._
> Alexandre Aquiles

> _Interfaces de Serviço, em geral, são do cliente._
> Uncle Bob

> _Essa interface em particular nos seria bastante útil se tivéssemos a necessidade de mudar a maneira de acesso a dados._
> _DAOs em particular são classes naturalmente estáveis, com interfaces geralmente bastante claras._
> _O principal aqui é lembrar de separar infraestrutura do resto [...]_
> Maurício Aniche

> _Devemos balancear entre módulos estáveis, em que não queremos mexer nunca, pois eles são importantes e muitas outras classes dependem deles, e módulos mais instáveis, que dependem dos estáveis, mas que vez ou outra precisam sofrer alterações._
> Maurício Aniche

> _Se você está programando alguma classe qualquer com regras de negócio, e precisa depender de outro módulo, ideal- mente esse outro módulo deve ser uma abstração._
> Maurício Aniche

> _Dependências devem apontar apenas para dentro, em direção às regras de negócio._
> Uncle Bob

## Referências

1. Livro [Agile Principles, Patterns, and Practices in C#](https://www.amazon.com.br/Agile-Principles-Patterns-Practices-C/dp/0131857258), Uncle Bob, 2006

2. Livro [Design Patterns](https://www.amazon.com.br/Design-Patterns-Object-Oriented-Addison-Wesley-Professional-ebook/dp/B000SEIBB8), Gamma & Helm & Johnson & Vlissides, 1995

3. Artigo [Design Principles and Design Patterns](http://www.cvc.uab.es/shared/teach/a21291/temes/object_oriented_design/materials_adicionals/principles_and_patterns.pdf), Uncle Bob, 2000

4. Post [Moldes de Modelagem](https://alexandreaquiles.com.br/2014/02/10/moldes-de-modelagem/), Alexandre Aquiles, 2014

5. Livro [OO e SOLID para Ninjas](https://www.casadocodigo.com.br/products/livro-oo-solid), Maurício Aniche, 2015

6. Livro [Clean Architecture](https://www.amazon.com/Clean-Architecture-Craftsmans-Software-Structure/dp/0134494164), Uncle Bob, 2017

7. Palestra [Why can't anyone get Web architecture right?](https://skillsmatter.com/skillscasts/2437-uncle-bob-web-architecture), Uncle Bob, 2011
