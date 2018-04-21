package com.roberto.genericstack;

import java.util.LinkedList;
import java.util.List;

public class GenericStack<T> {
    private LinkedList<T> stack;

    public GenericStack() {
        stack = new LinkedList<T>();
    }

    private int quantidadeElementos() {
        return stack.size();
    }

    public Boolean estaVazia() {
        return quantidadeElementos() <= 0 ? true : false;
    }

}
