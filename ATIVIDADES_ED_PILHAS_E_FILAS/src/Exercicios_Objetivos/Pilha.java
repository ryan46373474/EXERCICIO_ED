package Exercicios_Objetivos;

public class Pilha {
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

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo da pilha: " + pilha.peek());

        while (!pilha.isEmpty()) {
            System.out.println("Removido: " + pilha.pop());
        }
    }
}
