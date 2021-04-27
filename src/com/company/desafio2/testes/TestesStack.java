package com.company.desafio2.testes;

import com.company.desafio2.structures.MyStack;
import com.company.desafio2.structures.Pessoa;

public class TestesStack {

	public static void main(String[] args) {
		MyStack<String> stack = new MyStack<>();
		
		stack.push("1");
//		stack.push("2");
//		stack.push("3");
//		stack.push("4");
//		stack.push("5");
//		stack.push("6");
//		stack.push("7");		
//		stack.push("8");
//		stack.push("9");
//		stack.push("10");
//		stack.push("11");
//		stack.pop();
		
//		System.out.println(stack);
//		System.out.println(stack.pop());
		
		MyStack<Pessoa> stack2 = new MyStack<>(5);
		
		stack2.push(new Pessoa("05198429421", "José Fernando"));
		stack2.push(new Pessoa("65421331516", "Pedro Lima"));
		stack2.push(new Pessoa("98421651665", "Ulisses Oliviera"));
		stack2.push(new Pessoa("32198716843", "João Paulo"));
		stack2.push(new Pessoa("98131981921", "Caio Silva"));
//		stack2.push(new Pessoa("78567840951", "Kleber Souza"));
		stack2.pop();
		
		System.out.println(stack2.peek());
		System.out.println(stack2);
	}

}
