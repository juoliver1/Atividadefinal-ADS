

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
		System.out.println("A soma do número 250 com o número 50 é: " + calculadora.soma(250, 50));
		System.out.println("A subtração do número 400 com o número 200 é: " + calculadora.subtracao(400, 200));
		System.out.println("A divisão do número 30 por 5 é: " + calculadora.divisao(30, 5));
		System.out.println("A multiplicação do número 50 com o número 2 é: " + calculadora.multiplicacao(50,2));
		System.out.println("A raiz quadrada de 36 é: " + calculadora.raiz(36));
		System.out.println("O resultado de 2 elevado a 3 é: " + calculadora.exponencial(2, 3));
    }
}

