package br.com.wemmelotec.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SimpleMathTest {

	@Test
	void testSum() {
		//primeiro instaciar a classe que eu quero testar
		SimpleMath math = new SimpleMath();
		//vou chamar uma operação no SimpleMath para testar
		Double actual = math.sum(6.2D, 2D);
		//e verificar se é o que eu esperava
		//como o assertEquals é static eu posso imortar ela direto pra cá
		double expected = 8.2D;
		assertEquals(expected, actual);
		
		//no primeiro teste deu tudo certo, agora supunho que um programador no futuro mude a lógica do método sum
		//colocando para multiplicar, por exemplo, aí ele vai falhar.
		//os testes unitários automatizados servem justamente para proteger o código contra futuras alterações
		//que possam vir a quebrar o código
	}

}
