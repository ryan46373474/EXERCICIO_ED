package Listas_Encadeadas_Simples;
class NoSimples {
    int valor;
    NoSimples proximo;

    NoSimples(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}

class ListaSimples {
    private NoSimples inicio;
    private int tamanho;

    public void inserirNoInicio(int valor) {
        NoSimples novo = new NoSimples(valor);
        novo.proximo = inicio;
        inicio = novo;
        tamanho++;
    }

    public void inserirNoFinal(int valor) {
        NoSimples novo = new NoSimples(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            NoSimples aux = inicio;
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novo;
        }
        tamanho++;
    }

    public void inserirNaPosicao(int pos, int valor) {
        if (pos <= 0) {
            inserirNoInicio(valor);
        } else if (pos >= tamanho) {
            inserirNoFinal(valor);
        } else {
            NoSimples novo = new NoSimples(valor);
            NoSimples aux = inicio;
            for (int i = 0; i < pos - 1; i++) {
                aux = aux.proximo;
            }
            novo.proximo = aux.proximo;
            aux.proximo = novo;
            tamanho++;
        }
    }

    public void removerNoInicio() {
        if (inicio != null) {
            inicio = inicio.proximo;
            tamanho--;
        }
    }

    public void removerNoFinal() {
        if (inicio == null) return;
        if (inicio.proximo == null) {
            inicio = null;
        } else {
            NoSimples aux = inicio;
            while (aux.proximo.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = null;
        }
        tamanho--;
    }

    public void removerNaPosicao(int pos) {
        if (pos < 0 || pos >= tamanho) return;
        if (pos == 0) {
            removerNoInicio();
        } else {
            NoSimples aux = inicio;
            for (int i = 0; i < pos - 1; i++) {
                aux = aux.proximo;
            }
            aux.proximo = aux.proximo.proximo;
            tamanho--;
        }
    }

    public int tamanho() {
        return tamanho;
    }

    public void exibir() {
        NoSimples aux = inicio;
        while (aux != null) {
            System.out.print(aux.valor + " ");
            aux = aux.proximo;
        }
        System.out.println();
    }
}
