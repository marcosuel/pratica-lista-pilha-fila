package com.company.desafio2.structures;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack<E> {
	
	private E[] content;
	private int size = 0;
	private int capacity = 10;
	
	public MyStack() {
		this.content = (E[]) new Object[capacity];
	}
	
	public MyStack(int capacity) {
		this.capacity = capacity;
		this.content = (E[]) new Object[capacity];
	}
	
	public E push(E elem) {
		if(this.isFull())	throw new StackOverflowError("Stack size: "+size+" | Stack capacity: "+capacity);
		
		content[size] = elem;
		size++;
		return elem;
	}
	
	public E pop() {
		makeSureStackIsNotEmpty();
		
		E aux = content[size-1];
		content[size-1] = null;
		size--;
		return aux;
	}
	
	public E peek() {
		makeSureStackIsNotEmpty();
		
		return content[size-1];
	}
	
	private void makeSureStackIsNotEmpty() {
		if(this.isEmpty())	throw new EmptyStackException();
	}
	
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}
	
	public boolean isFull() {
		return size >= capacity ? true : false;
	}
	
	public int size() {
		return this.size;
	}

	public MyStack(E[] content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "MyStack [content=" + Arrays.toString(content) + "]";
	}
}
