# S.O.L.I.D.

Robert Cecil Martin, o famoso Uncle Bob, listou os seus 10 (ou 11) mandamentos da Programação Orientada a Objetos, no grupo Usenet [comp.object](https://groups.google.com/forum/?hl=en#!topic/comp.object/WICPDcXAMG8), em 16/Março/1995.

Em 1996, fez uma série de artigos na revista _C++ Report_ sobre o que chamou de **princípios**.

O foco é nas dependências entre objetos e componentes (ou módulos).

Uncle Bob não tira a importância de OO para a modelagem de negócio ou do mundo real, mas foca no gerenciamento de dependências.
Um bom gerenciamento de dependências torna o código mais robusto, flexível e reusável.

Em 2002, no livro [Agile Software Development Principles, Patterns and Patterns](https://www.amazon.com.br/Software-Development-Principles-Patterns-Practices/dp/0135974445), Uncle Bob documentou essas ideias, cunhando o acrônimo S.O.L.I.D.

> Esse livro teve uma versão em C#, [Agile Principles, Patterns, and Practices in C#](https://www.amazon.com.br/Agile-Principles-Patterns-Practices-C/dp/0131857258), lançada em 2006.

Uncle Bob [indica](https://sites.google.com/site/unclebobconsultingllc/getting-a-solid-start) que os princípios não são _check lists_, nem leis ou regras. São bons conselhos vindos do senso comum de gente experiente, coletados em projetos reais ao longo do tempo. Não significa que sempre funcionam ou que sempre devem ser seguidos.

## Princípios de classes

Os 5 princípios S.O.L.I.D. são focados em modelagem de classes:

- _**S**ingle Responsibility Principle_:  Uma classe deve ter um, e apenas um, motivo para ser mudada.
- _**O**pen/Closed Principle_:  Deve ser possível extender o comportamento de uma classe sem modificá-la.
- _**L**iskov Substitution Principle_:  Classes derivadas devem ser substituíveis pelas classes base.
- _**I**nterface Segregation Principle_:  Uma classe deve ter um, e apenas um, motivo para ser mudada.
- _**D**ependency Inversion Principle_:  Dependa de abstrações, não de classes concretas.

## Referências

1. Mensagem do Uncle Bob na discussão [The Ten Commandments of OO Programming](https://groups.google.com/forum/?hl=en#!topic/comp.object/WICPDcXAMG8) no grupo Usenet comp.object, em 16/03/1995

2. Livro [Agile Software Development, Principles, Patterns, and Practices](https://www.amazon.com.br/Software-Development-Principles-Patterns-Practices/dp/0135974445), do Uncle Bob, 2002

3. Livro [Agile Principles, Patterns, and Practices in C#](https://www.amazon.com.br/Agile-Principles-Patterns-Practices-C/dp/0131857258), do Uncle Bob, 2006

4. [Getting a SOLID start](https://sites.google.com/site/unclebobconsultingllc/getting-a-solid-start), do Uncle Bob, um post introdutório sobre os princípios S.O.L.I.D.
