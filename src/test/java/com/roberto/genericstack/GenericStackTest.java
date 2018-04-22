package com.roberto.genericstack;

import org.junit.Test;
import org.junit.Assert;

public class GenericStackTest {

    @Test
    public void confirmarQuePilhaEstaVazia() {
        GenericStack genericStack = new GenericStack<Integer>(10);
        Assert.assertTrue(genericStack.estaVazia());
    }

    @Test
    public void confirmarQueDepoisDeInserirItemAPilhaNaoEstaVazia() {
        GenericStack genericStack = new GenericStack<Integer>(10);
        genericStack.push(1);
        genericStack.push(1);
        genericStack.push(1);
        Assert.assertFalse(genericStack.estaVazia());
    }

    @Test
    public void confirmarQueQuantidadeElementosZeroNaPilaQuandoIniciada() {
        GenericStack genericStack = new GenericStack<Integer>(10);
        Assert.assertEquals(0, genericStack.quantidadeElementos());
    }

    @Test
    public void confirmarQueUmNovoElementoFoiAdicionado() {
        GenericStack genericStack = new GenericStack<Integer>(10);
        int quantidadeElementosAtual = genericStack.quantidadeElementos();
        genericStack.push(1);
        Assert.assertEquals(quantidadeElementosAtual + 1, genericStack.quantidadeElementos());
    }

    @Test
    public void confirmarElementoFoiRemovido() {
        GenericStack genericStack = new GenericStack<Integer>(10);
        int quantidadeElementosAtual = genericStack.quantidadeElementos();
        genericStack.push(1);
        genericStack.pop();
        Assert.assertEquals(quantidadeElementosAtual, genericStack.quantidadeElementos());
    }

    @Test(expected=StackOverflowError.class)
    public void garantirQueOLimiteDaPilhaNaoSeraExcedido() {
        GenericStack genericStack = new GenericStack<Integer>(1);
        genericStack.push(1);
        genericStack.push(1);
    }

    @Test(expected=StackOverflowError.class)
    public void garantirNaoPossivelRemoverElementoQuandoPilhaEstaVazia() {
        GenericStack genericStack = new GenericStack<Integer>(1);
        genericStack.pop();
    }

    @Test
    public void garantirQueEstaRetornandoPrimeiroElemento() {
        GenericStack genericStack = new GenericStack<Integer>(5);
        int elemento = 3;
        genericStack.push(1);
        genericStack.push(5);
        genericStack.push(8928383);
        genericStack.push(elemento);
        Assert.assertEquals(elemento, genericStack.top());
    }

    @Test
    public void garantirQueEstaRetornandoUltimoElemento() {
        GenericStack genericStack = new GenericStack<Integer>(5);
        int elemento = 3;
        genericStack.push(elemento);
        genericStack.push(5);
        genericStack.push(8928383);
        genericStack.push(2732783);
        Assert.assertEquals(elemento, genericStack.bot());
    }
}
