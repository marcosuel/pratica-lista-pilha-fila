package com.company.desafio2.testes;

import java.util.ArrayList;
import java.util.Stack;

import com.company.desafio2.structures.MyArray;
import com.company.desafio2.structures.MyStack;
import com.company.desafio2.structures.Pessoa;

public class TestesArray {

	public static void main(String[] args) {
		
		MyArray<String> arr = new MyArray();
		
		arr.add("0");
		arr.add("1");
		arr.add("2");
		arr.add("3");
		arr.add("4");
		arr.add("5");
		arr.add("6");
		arr.add("7");
		arr.add(1, "8");	
		
//		System.out.println(arr.remove(0));
//		arr.add(11,"9");
		
		System.out.println(arr);
//		System.out.println(arr.get(3));
	}

}
