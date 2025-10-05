package Lista_Encadeada_Dupla;
class NoDuplo {
    int valor;
    NoDuplo anterior;
    NoDuplo proximo;

    NoDuplo(int valor) {
        this.valor = valor;
        this.anterior = null;
        this.proximo = null;
    }
}

class ListaDupla {
    private NoDuplo inicio;
    private NoDuplo fim;
    private int tamanho;

    public void inserirNoInicio(int valor) {
        NoDuplo novo = new NoDuplo(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tamanho++;
    }

    public void inserirNoFinal(int valor) {
        NoDuplo novo = new NoDuplo(valor);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tamanho++;
    }

    public void inserirNaPosicao(int pos, int valor) {
        if (pos <= 0) {
            inserirNoInicio(valor);
        } else if (pos >= tamanho) {
            inserirNoFinal(valor);
        } else {
            NoDuplo aux = inicio;
            for (int i = 0; i < pos; i++) {
                aux = aux.proximo;
            }
            NoDuplo novo = new NoDuplo(valor);
            novo.proximo = aux;
            novo.anterior = aux.anterior;
            aux.anterior.proximo = novo;
            aux.anterior = novo;
            tamanho++;
        }
    }

    public void removerNoInicio() {
        if (inicio == null) return;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tamanho--;
    }

    public void removerNoFinal() {
        if (fim == null) return;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tamanho--;
    }

    public void removerNaPosicao(int pos) {
        if (pos < 0 || pos >= tamanho) return;
        if (pos == 0) {
            removerNoInicio();
        } else if (pos == tamanho - 1) {
            removerNoFinal();
        } else {
            NoDuplo aux = inicio;
            for (int i = 0; i < pos; i++) {
                aux = aux.proximo;
            }
            aux.anterior.proximo = aux.proximo;
            aux.proximo.anterior = aux.anterior;
            tamanho--;
        }
    }

    public int tamanho() {
        return tamanho;
    }

    public void exibir() {
        NoDuplo aux = inicio;
        while (aux != null) {
            System.out.print(aux.valor + " ");
            aux = aux.proximo;
        }
        System.out.println();
    }
}
