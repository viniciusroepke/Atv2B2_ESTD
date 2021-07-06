package br.univille.estd.stack;

public interface Stack<E> {

    boolean isFull();
    boolean isEmpty();
    void push(int num);
    int pop();

}
