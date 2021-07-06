package br.univille.estd.stack;

import java.util.EmptyStackException;

public class StackWithArray implements Stack {

    int size; //tamanho
    int arr[]; //arranjo
    int top; //variavel t, de topo

    public StackWithArray(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1; // top = índice do elemento topo -> -1 indica que a pilha está vazia
    }

    @Override
    public boolean isFull(){
        return (size-1 == top);
    }

    @Override
    public boolean isEmpty(){
        return (top == -1);
    }

    @Override
    public void push(int num){
        if(isFull())
            throw new StackOverflowError("Pilha cheia : Stack Overflow");
        arr[++top] = num;
        System.out.println("Elemento inserido: "+num);
    }

    @Override
    public int pop(){
        if(isEmpty())
            throw new EmptyStackException();
        int val = arr[top];
        top--;
        System.out.println("Elemento removido: "+val);
        return val;
        }

}
