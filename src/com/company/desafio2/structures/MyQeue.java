package com.company.desafio2.structures;

import java.util.Arrays;

public class MyQeue<E> {

	private E[] content;
	private int size = 0;
	private int capacity = 10;
	
	public MyQeue() {
		this.content = (E[]) new Object[capacity];
	}
	
	public MyQeue(int capacity) {
		this.capacity = capacity;
		this.content = (E[]) new Object[capacity];
	}
	
	public boolean offer(E elem) {
		if(isFull())	return false;
		
		content[size] = elem;
		size++;
		return true;
	}
	
	public E poll() {
		if(isEmpty())	return null;
		
		E aux = content[0];
		for(int i = 0; i < size-1; i++) {
			content[i] = content[i+1];
		}
		content[size-1] = null;
		size--;
		return aux;
	}
	
	public E peek() {
		return !isEmpty() ? content[0] : null;
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
	
	@Override
	public String toString() {
		return "MyQeue [content=" + Arrays.toString(content) + "]";
	}
}
