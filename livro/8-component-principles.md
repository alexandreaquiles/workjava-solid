# Princípios de Componentes

Uncle Bob fala ainda sobre 6 princípios de componentes (ou módulos).

## Componentes (ou módulos)

Uncle Bob fala em _packages_, mas indica que está falando de entregáveis binários como `.jar` ou `.dll` e não de pacotes Java ou namespaces C++/C#.

Para Kirk Knoernschild, módulos são:

- Unidade de implantação e gerenciamento
- Unidade de composição e teste
- Unidade de reuso intraprocesso

Kirk Knoernschild define a unidade de modularidade no Java é o arquivo `.jar`.

## Princípios de Coesão de Componentes

Os 3 primeiros princípios de componentes são sobre **coesão**, sobre o que colocar dentro dos componentes:

- _Release Reuse Equivalency Principle_: A granularidade de reuso é a granularidade de entrega.
- _Common Closure Principle_: Classes que são modificadas juntas devem estar no mesmo componente.
- _Common Reuse Principle_: Classes que são usadas juntas devem estar no mesmo componente.

## Princípios de Acoplamento de Componentes

Há mais 3 princípios de componentes, focados no **acoplamento** e em métricas para avaliar a estrutura de componentes de um sistema.

- _Acyclic Dependencies Principle_: O grafo de dependências de componentes não deve ter ciclos.
- _Stable Dependencies Principle_: Dependa na direção da estabilidade.
- _Stable Abstractions Principle_: Abstração traz estabilidade.

## Ideias

Componentes (módulos) == JAR

Componentização / Modularização

- Reuso
- Composição
- Baixo acoplamento
- Desenvolvimento independente

Uma aplicação nem sempre tem apenas um JAR

Arquitetura de Plugins

## Citações

> _O melhor candidato à unidade de modularidade na plataforma Java é um arquivo JAR!_
> Kirk Knoernschild

> _Usando interfaces, invertemos as dependências para que todos dependam do domain model, que não depende de ninguém._
> _As dependências sempre apontam na direção das regras de negócio, nunca ao contrário._
> _Cada mecanismo de entrega seria um plugin diferente._
> Alexandre Aquiles

> _Não pule para microsserviços só porque parece legal._
> _Segregue o sistema em JARs usando uma arquitetura de plug-ins primeiro._
> _Se isso não for suficiente, considere a introdução de service boundaries em pontos estratégicos._
> Uncle Bob


## Referências

1. Artigo [Design Principles and Design Patterns](http://www.cvc.uab.es/shared/teach/a21291/temes/object_oriented_design/materials_adicionals/principles_and_patterns.pdf), Uncle Bob, 2000

2. Livro [Clean Architecture](https://www.amazon.com/Clean-Architecture-Craftsmans-Software-Structure/dp/0134494164), Uncle Bob, 2017

3. Post [Simplificando Service Providers com módulos do Java 9+](http://blog.caelum.com.br/simplicando-service-providers-com-modulos-do-java-9/), Alexandre Aquiles, 2018

4. Post [Microservices and JARs](https://blog.cleancoder.com/uncle-bob/2014/09/19/MicroServicesAndJars.html), Uncle Bob, 2014

5. Livro [Java Application Architecture: Modularity Patterns](https://www.amazon.com.br/Java-Application-Architecture-Modularity-Patterns/dp/0321247132), Kirk Knoernschild, 2012

6. Post [The Principles of OOD](http://butunclebob.com/ArticleS.UncleBob.PrinciplesOfOod), Uncle Bob, 2005
