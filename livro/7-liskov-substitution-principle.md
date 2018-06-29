# Liskov Substitution Principle

> **Subtipos devem ser substituíveis por seus tipos base.**
> Uncle Bob

## Ideias

Inveja de Funcionalidades (ou dados)

Encapsulamento

Código Tímido

OO == HERANÇA ???

Cachorro extends Gato?

Intimidade Inadequada

SUBSTITUIBILIDADE

## Técnicas

Tell Don't Ask

Lei de Demeter

Design Pattern: Iterator

## Citações

> _A essência dos objetos é que eles são uma técnica para empacotar dados com os processos usados nesses dados._
> _Um indício clássico de problema é um método que parece mais interessado em uma classe diferente daquela na qual ele se encontra._
> _O foco mais comum da inveja são os dados._
> Kent Beck e Martin Fowler

> _Perceber se um código está bem encapsulado ou não, não é tão difícil. [...] se pergunte:_
> _O que esse método faz? Provavelmente sua resposta será: eu sei o que o método faz pelo nome dele [...]_
> _ Como ele faz isso? Sua resposta provavelmente é: se eu olhar só para esse código, não dá para responder._
> Maurício Aniche

> _Envie comandos para objetos dizendo o que você quer fazer._
> _Explicitamente, não queremos consultar um objeto sobre seu estado, tomar uma decisão e, então, dizer ao objeto o que fazer._
> Andy Hunt e Dave Thomas

> _Código procedural tende a obter informações e, em seguida, tomar decisões baseadas nessas informações._
> _Código OO diz a objetos que façam coisas._
> Alec Sharp

> _A Lei de Demeter afirma que qualquer método de objeto deve chamar apenas métodos pertencentes a:_
> - _si mesmo_
> - _quaisquer parâmetros que foram passados para o método_
> - _quaisquer objetos criados_
> - _qualquer composição_
> Andy Hunt e Dave Thomas

> _Escrever código tímido é apenas um pequeno começo para evitar a introdução de bugs, mas realmente ajuda._
> _Assim como no mundo real, boas cercas fazem bons vizinhos - contanto que você não olhe pela cerca._
> Andy Hunt e Dave Thomas

> _Se um gato possui raça e patas, e um cachorro possui raça, patas e tipoDoPelo, logo Cachorro extends Gato?_
> _Pode parecer engraçado, mas é [...] herança por preguiça, por comodismo, por que vai dar uma ajudinha._
> _A relação “é um” não se encaixa aqui, e vai nos gerar problemas._
> Paulo Silveira

> _Às vezes as classes se tornam íntimas demais e gastam tempo demais sondando as partes privadas das outras._
> _Podemos não ser pudicos quando o assunto são pessoas, mas achamos que nossas classes devem seguir regras puritanas rígidas._
> _A herança pode muitas vezes levar à intimidade excessiva. Subclasses sempre saberão mais sobre seus pais do que esses gostariam que elas soubessem._
> Kent Beck e Martin Fowler

> _Como a herança expõe uma subclasse a detalhes da implementação de sua superclasse, costuma-se dizer que "a herança quebra o encapsulamento"._
> Gamma & Helm & Johnson & Vlissides

> _Sendo assim, em alguns casos você deve, e em outros não deve chamar o super, e você só vai saber disso quando conhecer o código fonte de sua classe pai HttpServlet (ou ler a documentação sobre esse comportamento estranho), quebrando o princípio de encapsulamento._
> Paulo Silveira

> _Se para cada objeto o1 do tipo S há um objeto o2 do tipo T que para todos os programas P definidos em termos de T, o comportamento de P não é modificado quando o1 é substituído por o2, então S é um subtipo de T._
> Barbara Liskov

> - _Item 14: Prefira composição a herança_
> - _Item 15: Modele pensando em herança ou proíba-a_
> - _Item 16: Prefira interfaces a classes abstratas_
> Joshua Bloch

## Referências

1. Livro [Refactoring](https://www.amazon.com/Refactoring-Improving-Design-Existing-Code/dp/0201485672/), Martin Fowler et al, 1999

2. Livro [OO e SOLID para Ninjas](https://www.casadocodigo.com.br/products/livro-oo-solid), Maurício Aniche, 2015

3. Artigo [The Art of Enbugging](https://media.pragprog.com/articles/jan_03_enbug.pdf), Andy Hunt e Dave Thomas, 2003

4. Livro [Smalltalk by Example](https://www.amazon.com/Smalltalk-Example-Developers-Alec-Sharp/dp/0079130364), Alec Sharp, 1997

5. Post [Como não aprender orientação a objetos: Herança](http://blog.caelum.com.br/como-nao-aprender-orientacao-a-objetos-heranca/), Paulo Silveira, 2006

6. Livro [Design Patterns](https://www.amazon.com.br/Design-Patterns-Object-Oriented-Addison-Wesley-Professional-ebook/dp/B000SEIBB8), Gamma & Helm & Johnson & Vlissides, 1995

7. Artigo [Data Abstraction and Hierarchy](https://pdfs.semanticscholar.org/36be/babeb72287ad9490e1ebab84e7225ad6a9e5.pdf), Barbara Liskov, 1988

8. Livro [Agile Principles, Patterns, and Practices in C#](https://www.amazon.com.br/Agile-Principles-Patterns-Practices-C/dp/0131857258), Uncle Bob, 2006

9. Livro [Effective Java](https://www.amazon.com/Effective-Java-Programming-Language-Guide/dp/0201310058), Joshua Bloch, 2001
