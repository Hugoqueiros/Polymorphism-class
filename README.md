# Polymorphism-class

Criar um projeto que inclua as classes seguintes (pelo menos 4 classes):

- Uma **superclasse** com, pelo menos, um atributo privado, um atributo protegido (protected) e um atributo público. A superclasse deverá ter ainda um atributo de classe.
- Pelo menos duas **subclasses** da superclasse anterior. Cada subclasse terá, pelo menos, um atributo privado.
- Se possível, uma **subclasse** de uma das subclasses anteriores.
- Uma **classe** que tem como atributo privado uma referência para a superclasse (composição).
- Uma **classe** de teste que terá o método main() que será usado para criar instâncias das outras classes.

Cada classe deverá ter construtores com e sem parâmetros.

Em todas as classes devem ser definidos métodos de acesso (get's e set's).

Devem ser usados a referência this e o método this().

A superclasse deve fazer a sobreposição (overriding) dos métodos toString(), clone() e equals(), herdados da classe Object. A superclasse deverá ter ainda um método designado por print() para imprimir os seus atributos.

As subclasses devem fazer a sobreposição do método print() herdado da superclasse. As subclasses deverão usar a referência super.

O projeto terá ainda de verificar o que acontece com as variáveis e métodos de classe numa situação de herança.

O projeto deverá demonstrar claramente o conceito de **polimorfismo**. Em particular, deverá exemplificar o processo de **seleção dinâmica de métodos (dynamic method lookup ou dynamic method dispatch)** usando um array e uma coleção de Java (p.e. ArrayList).

Este conjunto de classes deverá ser aplicado num **contexto concreto**, à escolha, que contribua para a exemplificação dos conceitos. Todas as propriedades das classes definidas acima devem ser exemplificadas.
