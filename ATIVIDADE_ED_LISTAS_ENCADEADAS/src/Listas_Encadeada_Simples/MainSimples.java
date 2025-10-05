package Listas_Encadeadas_Simples;
public class MainSimples {
    public static void main(String[] args) {
        ListaSimples lista1 = new ListaSimples();
        lista1.inserirNoInicio(10);
        lista1.inserirNoFinal(20);
        lista1.inserirNaPosicao(1, 15);
        lista1.exibir();
        lista1.removerNoInicio();
        lista1.exibir();
        lista1.removerNoFinal();
        lista1.exibir();
        lista1.removerNaPosicao(0);
        lista1.exibir();
        System.out.println("Tamanho: " + lista1.tamanho());
    }
}
