package Exercicios_Objetivos;

public class Estruturas {
    public static void main(String[] args) {
        System.out.println("=== Teste da Pilha ===");
        Pilha pilha = new Pilha(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo da pilha: " + pilha.peek());

        while (!pilha.isEmpty()) {
            System.out.println("Removido da pilha: " + pilha.pop());
        }

        System.out.println("\n=== Teste da Fila ===");
        Fila fila = new Fila(5);
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Primeiro da fila: " + fila.peek());

        while (!fila.isEmpty()) {
            System.out.println("Removido da fila: " + fila.dequeue());
        }
    }
}

class Pilha {
    private int[] elementos;
    private int topo;

    public Pilha(int capacidade) {
        elementos = new int[capacidade];
        topo = -1;
    }

    public void push(int valor) {
        if (topo < elementos.length - 1) {
            topo++;
            elementos[topo] = valor;
        } else {
            System.out.println("Pilha cheia!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int valor = elementos[topo];
            topo--;
            return valor;
        }
        System.out.println("Pilha vazia!");
        return -1;
    }

    public int peek() {
        if (!isEmpty()) {
            return elementos[topo];
        }
        System.out.println("Pilha vazia!");
        return -1;
    }

    public boolean isEmpty() {
        return topo == -1;
    }
}

class Fila {
    private int[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila(int capacidade) {
        elementos = new int[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void enqueue(int valor) {
        if (tamanho < elementos.length) {
            elementos[fim] = valor;
            fim = (fim + 1) % elementos.length;
            tamanho++;
        } else {
            System.out.println("Fila cheia!");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int valor = elementos[inicio];
            inicio = (inicio + 1) % elementos.length;
            tamanho--;
            return valor;
        }
        System.out.println("Fila vazia!");
        return -1;
    }

    public int peek() {
        if (!isEmpty()) {
            return elementos[inicio];
        }
        System.out.println("Fila vazia!");
        return -1;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
}
