package br.com.wemmelotec;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FooBarTest {

	@Test
	void test() {
		
		//primeiro comando que vai gerar uma falha, isso é uma assertions para garantir que vai falhar pois ainda não foi implementado
		//fail("Not yet implemented");
		
		//segundo comando que não vai ter falha, apenas o sysout
		System.out.println("Junit");
	}

}
