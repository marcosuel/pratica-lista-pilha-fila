package com.company.desafio2.testes;

import com.company.desafio2.structures.MyQeue;
import com.company.desafio2.structures.Pessoa;

public class TestesQeue {

	public static void main(String[] args) {
		MyQeue<String> qeue = new MyQeue<String>(4);
		
		qeue.offer("primeiro");
		qeue.offer("segundo");
		qeue.offer("terceiro");
		qeue.offer("quarto");
		
//		MyQeue<Pessoa> q2 = new MyQeue<Pessoa>(2);
		
//		q2.offer(new Pessoa("05198429421", "José Fernando"));
//		q2.offer(new Pessoa("65421331516", "Pedro Lima"));
//		q2.poll();
//		q2.offer(new Pessoa("64856210919", "Bruno Carvalho"));
//		System.out.println(q2);
		
//		System.out.println(qeue.offer("quinto"));
		System.out.println("Elemento removido: "+qeue.poll());
//		qeue.poll();
//		qeue.offer("quinto");
//		qeue.poll();
//		qeue.poll();
//		qeue.poll();
//		qeue.poll();
		System.out.println("Atual cabeça: "+qeue.peek());
		System.out.println(qeue);
	}

}
