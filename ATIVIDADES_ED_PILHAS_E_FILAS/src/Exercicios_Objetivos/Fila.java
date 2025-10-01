package Exercicios Objetivos;

public class Fila {
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

    public static void main(String[] args) {
        Fila fila = new Fila(5);
        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        System.out.println("Primeiro da fila: " + fila.peek());

        while (!fila.isEmpty()) {
            System.out.println("Removido: " + fila.dequeue());
        }
    }
}
