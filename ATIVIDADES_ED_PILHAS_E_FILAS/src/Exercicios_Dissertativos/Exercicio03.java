
// Um sistema precisa controlar tarefas usando simultaneamente uma fila e uma pilha. 
//As tarefas chegam e são inseridas na fila, mas algumas tarefas prioritárias precisam 
//ser movidas imediatamente para a pilha, sendo resolvidas antes das demais. 
//Explique qual será a ordem final de execução das tarefas e justifique o porquê, 
//considerando o funcionamento das duas estruturas.

//R:
//Nesse sistema, as tarefas são inicialmente inseridas em uma fila, que funciona
//no princípio FIFO (First In, First Out). Isso significa que a primeira tarefa a
//ser adicionada à fila será a primeira a ser executada. No entanto, quando uma
//tarefa prioritária chega, ela é movida para uma pilha, que opera no princípio
//LIFO (Last In, First Out). Isso significa que a última tarefa adicionada à
//pilha será a primeira a ser executada.