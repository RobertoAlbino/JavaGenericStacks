package com.roberto.genericstack;

import org.junit.Test;
import org.junit.Assert;

public class GenericStackTest {

    @Test
    public void confirmarQuePilhaEstaVazia() {
        GenericStack genericStack = new GenericStack<Integer>();
        Assert.assertTrue(genericStack.estaVazia());
    }
}
