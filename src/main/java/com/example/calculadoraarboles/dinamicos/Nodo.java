package com.example.calculadoraarboles.dinamicos;

public class Nodo<E> {
    public E valor;
    public Nodo<E> next;

    public Nodo(E valor) {
        this.valor = valor;
        next = null;
    }
}
