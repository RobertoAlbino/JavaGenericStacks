package com.roberto.genericstack;

import java.util.LinkedList;

public class GenericStack<T> {
    private LinkedList<T> stack;
    private long limiteElementos = 0;

    public GenericStack(long limiteElementos) {
        stack = new LinkedList<T>();
        this.limiteElementos = limiteElementos;
    }

    public int quantidadeElementos() {
        return stack.size();
    }

    public Boolean estaVazia() {
        return quantidadeElementos() <= 0 ? true : false;
    }

    public void push(T elemento) {
        if (quantidadeElementos() >= limiteElementos)
            throw new StackOverflowError("O límite máximo de elementos foi atingido.");

        stack.push(elemento);
    }

    public void pop() {
        if (estaVazia())
            throw new StackOverflowError("A pilha está vazia");

        stack.pop();
    }

    public T top() {
        return stack.getFirst();
    }

    public T bot() {
        return stack.getLast();
    }

}
