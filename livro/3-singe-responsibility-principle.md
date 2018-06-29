# Single Responsibility Principle

O _Princípio da Responsabilidade Única_:

> **Uma classe deve ter um, e apenas um, motivo para ser mudada.**
> Uncle Bob

## Ideias

Muitas responsabilidades == Muitas razões para mudar

COESÃO: Coerência de pensamento ou de um todo.

CLASSES COESAS

- menores e mais simples de entender
- menos bugs por classe
- mais fáceis de reutilizar

MVC: Molde pré-estabelecido de distribuição de responsabilidades

PROBLEMA COMUM DE COESÃO: Controller fazendo coisas demais

## Técnicas

GRASP: General Responsibility Assignment Software Principles 

Princípios criados por Craig Larman que documentam soluções comuns para atribuição de responsabilidades a objetos.

- High cohesion
- Low coupling
- Indirection
- Polymorphism: use polimorfismo ao invés de if's para o que varia.
- Protected variations: esconda o que varia atrás de uma interface comum.
- Information Expert: atribua uma responsabilidade à classe que tem a maior quantidade de informação para cumpri-la
- Controller: um "ponto de entrada" do sistema além da UI que recebe "eventos". Representa um "caso de uso" no código.
- Creator: encapsula a criação de outros objetos.
- Pure fabrication: classe que não existe no domínio de negócio mas promove baixo acoplamento e alta coesão

RDD: Responsibility Driven Design

CRC: Class-Responsibility-Collaborator

CRC é um técnica criada por Kent Beck e Ward Cunningham pra exploração das classes de um sistema e suas respectivas responsabilidades

REGRAS DO DESIGN SIMPLES

1. Roda todos os testes
2. Não contém nenhuma duplicação
3. Expressa as ideias com clareza
4. Minimiza o número de classes e métodos

Don't Repeat Yourself

## Citações

> _Prestar atenção aos imports nos oferece pistas de problemas no gerenciamento de dependências do nosso código._
> Alexandre Aquiles

> _... começar de um código estruturado, modificando-o em pequenos passos, até chegar a um código extensível e com as responsabilidades bem definidas, é uma boa maneira de ver a verdadeira utilidade de OO. E de aprender!_
> Alexandre Aquiles


> _Como encontrar classes que não são coesas?_
> _Procure por classes que:_
> - _possuem muitos métodos diferentes_
> - _são modificadas com frequência_
> - _não param nunca de crescer_
> Maurício Aniche


> _Não ache que você conseguirá escrever classes coesas o tempo todo, e de primeira._
> _Escrever código de qualidade é sempre incremental; você modela, observa seu modelo, aprende com ele e o melhora._
> _Encontrar os pontos onde sua modelagem precisa ser flexível e onde não precisa é um desafio._
> Maurício Aniche


> _Pense em objetos como pessoas com responsabilidades que colaboram com outras pessoas para fazer coisas. RDD enxerga projeto OO como uma comunidade de objetos colaborativos e responsáveis._
> Rebecca Wirfs-Brock

> _Dependência é o principal problema em desenvolvimento de software. Duplicação é o sintoma._
> _Mas, ao contrário da maioria dos problemas na vida, nos quais eliminar os sintomas faz com que um problema mais grave apareça em outro lugar, eliminar duplicação nos programas elimina dependência._
> Kent Beck

> _Todo bloco de conhecimento deve ter uma representação única, sem ambiguidades e dominante num sistema._
> Andy Hunt e Dave Thomas

## Referências

1. Post [Ouça seus imports](https://alexandreaquiles.com.br/2013/01/13/ouca-seus-imports/), Alexandre Aquiles, 2013

2. Post [Refatorar é bom para aprender OO](https://alexandreaquiles.com.br/2010/10/24/refatorar_aprender_oo/), Alexandre Aquiles, 2010

3. Livro [OO e SOLID para Ninjas](https://www.casadocodigo.com.br/products/livro-oo-solid), Maurício Aniche, 2015

4. Livro [Applying UML and Patterns, 3rd Ed.](https://www.amazon.com/Applying-UML-Patterns-Introduction-Object-Oriented/dp/0131489062/ref=dp_ob_title_bk), Craig Larman, 2004

5. Livro [The Object Primer](https://www.amazon.com/exec/obidos/ASIN/0521540186/ambysoftinc), Scott Ambler, 2004

6. Livro [TDD by Example](https://www.amazon.com/Test-Driven-Development-Kent-Beck/dp/0321146530), Kent Beck, 2002

7. Livro [The Pragmatic Programmer](https://www.amazon.com.br/Pragmatic-Programmer-Journeyman-Master/dp/020161622X), Andy Hunt e Dave Thomas, 1999

8. Post [Essential XP: Emergent Design](https://ronjeffries.com/xprog/classics/expemergentdesign/), Ron Jeffries, 2001

9. Post [Putting An Age-Old Battle To Rest](http://blog.thecodewhisperer.com/permalink/putting-an-age-old-battle-to-rest), J. B. Rainsberger, 2013
