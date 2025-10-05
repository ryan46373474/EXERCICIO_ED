package Lista_Encadeada_Dupla;
public class MainDupla {
    public static void main(String[] args) {
        ListaDupla lista2 = new ListaDupla();
        lista2.inserirNoInicio(30);
        lista2.inserirNoFinal(40);
        lista2.inserirNaPosicao(1, 35);
        lista2.exibir();
        lista2.removerNoInicio();
        lista2.exibir();
        lista2.removerNoFinal();
        lista2.exibir();
        lista2.removerNaPosicao(0);
        lista2.exibir();
        System.out.println("Tamanho: " + lista2.tamanho());
    }
}