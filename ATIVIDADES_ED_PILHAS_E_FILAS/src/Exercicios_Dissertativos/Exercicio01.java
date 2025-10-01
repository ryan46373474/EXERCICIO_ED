
//  Um aplicativo de edição de texto permite que o usuário use a função 
//"Desfazer" (Ctrl+Z). Cada ação realizada pelo usuário precisa ser 
//desfeita na ordem inversa em que aconteceu. 
//Qual estrutura de dados é mais adequada para essa situação: fila ou 
//pilha? Explique.

//R:
//A função “Desfazer” (Ctrl+Z) de um editor de texto funciona melhor com uma pilha. Isso porque a pilha é tipo uma pilha de livros: o último que eu coloco em cima é o primeiro que eu tiro.

//No caso do editor de texto, cada ação que eu faço (como digitar uma letra ou apagar algo) é guardada nessa pilha. Quando eu aperto Ctrl+Z, o programa desfaz a última ação primeiro, depois a penúltima, e assim por diante. Se fosse uma fila, ele desfaria as coisas na ordem em que eu fiz, o que não faria sentido, porque eu quero voltar no caminho inverso das minhas ações.

//Então, a pilha é perfeita para organizar e desfazer as ações do usuário na ordem certa.