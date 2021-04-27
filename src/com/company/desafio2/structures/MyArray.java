package com.company.desafio2.structures;

import java.util.Arrays;

public class MyArray<E> {

	private E[] content;
	private int size;

	public MyArray() {
		this.size = 0;
		this.content = (E[]) new Object[10];
	}

	public boolean add(E elem) {
		try {
			increaseSizeIfArrayFull();
			content[size] = elem;
			size++;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean add(int index, E elem) {
		if(index > size) throw new IndexOutOfBoundsException();
		
		try {
			increaseSizeIfArrayFull();
			
			for(int i = size; i > index; i--) {
				content[i] = content[i-1];
			}
			
			content[index] = elem;
			size++;
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	private void increaseSizeIfArrayFull() {
		if (size >= content.length) {
			E[] aux = (E[]) new Object[content.length * 2];
			for (int i = 0; i < content.length; i++) {
				aux[i] = content[i];
			}
			content = aux;
		}
	}

	
	
	
	
	//teste mais
	public E remove(int index) {
		E elem = this.get(index);
				
		for(int i = index; i < size; i++) {
			if(i + 1 != size) {
				content[i] = content[i+1];
			}else {
				content[i] = null;
			}
		}
		
		size--;
		return elem;
	}
	
	public E get(int index) {
		if(index >= size || index < 0) throw new IndexOutOfBoundsException();
		return content[index];
	}
	
	public int indexOf(Object elem) {
		for (int i = 0; i < size; i++) {
			if(elem == null) {
				if(content[i] == elem) return i;
			} else if (content[i].equals(elem)) {
				return i;
			}
		}
		return -1;
	}

	public boolean isEmpty() {
		return size > 0 ? false : true;
	}

	public int size() {
		return this.size;
	}

	@Override
	public String toString() {
		return "MyArray [content=" + Arrays.toString(content) + "]";
	}

//	@Override public String toString() { 
//		String desc = "["; for(int i = 0; i < size - 1; i++) { 
//			desc += content[i].toString()+", "; 
//		} 
//		desc += content[size-1].toString()+']'; 
//		return desc; 
//	}
}
