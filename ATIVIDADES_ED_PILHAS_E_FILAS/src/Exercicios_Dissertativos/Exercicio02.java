

// Um hospital precisa organizar os exames realizados em pacientes 
//durante o dia. Cada exame é registrado em ordem cronológica. No fim 
//do dia, o sistema deve imprimir esses exames na ordem inversa à que 
//foram feitos (do último para o primeiro). 
//Que estrutura você usaria para guardar os exames: fila ou pilha? 
//Implementaria com array ou lista encadeada? Justifique.

//R:
//Para organizar os exames realizados em pacientes durante o dia e
//imprimi-los na ordem inversa, a estrutura de dados mais adequada seria
//uma pilha. Isso porque a pilha funciona no princípio LIFO (Last In, First Out),
//ou seja, o último exame registrado será o primeiro a ser impresso no fim do dia
//Quando um exame é realizado, ele é "empilhado" no topo da pilha. No final do dia,
//quando precisamos imprimir os exames, começamos do topo da pilha e vamos "desempilhando"
//cada exame, garantindo que o último exame realizado seja o primeiro a ser impresso.
//Quanto à implementação, tanto um array quanto uma lista encadeada podem ser usados
//para implementar a pilha. No entanto, uma lista encadeada pode ser mais vant
//ajosa nesse caso, pois permite um crescimento dinâmico conforme o número de exames
//realizados, sem a necessidade de definir um tamanho fixo como em um array. Além
//disso, a inserção e remoção de elementos em uma lista encadeada são operações
//mais eficientes, especialmente se o número de exames variar bastante ao longo do dia.







