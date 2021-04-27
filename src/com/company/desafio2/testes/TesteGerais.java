package com.company.desafio2.testes;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class TesteGerais {

	public static void main(String[] args) {
		/*
		ArrayList<String> strs = new ArrayList<>();
		
		strs.add("0");
		strs.add("1");
		strs.add("2");
		strs.add("3");
		strs.add("4");
		strs.add("5");
		strs.add(null);
		
		System.out.println(strs.toString());
		*/
		
		ArrayBlockingQueue<String> qeue = new ArrayBlockingQueue<String>(2);
		
		qeue.offer("primeiro");
		qeue.offer("segundo");
		qeue.offer("terceiro");
		qeue.poll();
		qeue.offer("terceiro");
		
		System.out.println(qeue);
	}

}
