class Node {
    int valor;
    Node prox;
    Node(int v) { valor = v; }
}

class Lista {
    Node inicio;

    void inserirFinal(int v) {
        Node novo = new Node(v);
        if (inicio == null) inicio = novo;
        else {
            Node aux = inicio;
            while (aux.prox != null) aux = aux.prox;
            aux.prox = novo;
        }
    }

    int removerInicio() {
        if (inicio == null) return -1;
        int v = inicio.valor;
        inicio = inicio.prox;
        return v;
    }

    void mostrar() {
        Node aux = inicio;
        while (aux != null) {
            System.out.print(aux.valor + " ");
            aux = aux.prox;
        }
        System.out.println();
    }

    int contarMaiores10() {
        int c = 0;
        Node aux = inicio;
        while (aux != null) {
            if (aux.valor > 10) c++;
            aux = aux.prox;
        }
        return c;
    }

    int[] somatorios() {
        int sMaior = 0, sMenor = 0;
        Node aux = inicio;
        while (aux != null) {
            if (aux.valor > 10) sMaior += aux.valor;
            else sMenor += aux.valor;
            aux = aux.prox;
        }
        return new int[]{sMaior, sMenor};
    }

    int contarPares() {
        int c = 0;
        Node aux = inicio;
        while (aux != null) {
            if (aux.valor % 2 == 0) c++;
            aux = aux.prox;
        }
        return c;
    }
}

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserirFinal(5);
        lista.inserirFinal(12);
        lista.inserirFinal(7);
        lista.inserirFinal(25);
        lista.inserirFinal(10);
        lista.inserirFinal(18);

        lista.mostrar();
        System.out.println("Removido: " + lista.removerInicio());
        lista.mostrar();

        System.out.println("Maiores que 10: " + lista.contarMaiores10());
        int[] s = lista.somatorios();
        System.out.println("Soma >10: " + s[0] + " Soma <=10: " + s[1]);
        System.out.println("Pares: " + lista.contarPares());
    }
}
