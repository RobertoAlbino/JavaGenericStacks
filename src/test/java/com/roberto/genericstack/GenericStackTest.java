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
}
