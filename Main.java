import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        double numero1, numero2;
        while (true) {
            System.out.print("Digite uma opção (1-soma, 2-subtracao, 3-multiplicacao, 4-divisao, 5-exponencial, 6-raiz, 7-piso, 8-teto, 0-sair): ");
            opcao = scanner.nextInt();


            if (opcao == 0)
                break;
            if(opcao == 6 || opcao == 7 || opcao == 8 ){

                System.out.println("Digite um numero : ");
                numero1 = scanner.nextDouble();
                numero2 = 0;
            } else {

                System.out.print("Digite o primeiro numero: ");
                numero1 = scanner.nextDouble();
                System.out.print("Digite o segundo numero: ");
                numero2 = scanner.nextDouble();
            }



            switch (opcao) {
                case 1: {
                    System.out.println(calculadora.soma(numero1, numero2));
                    break;
                }
                case 2: {
                    System.out.println(calculadora.subtracao(numero1, numero2));
                    break;
                }
                case 3: {
                    System.out.println(calculadora.multiplicacao(numero1, numero2));
                    break;
                }
                case 4: {
                    System.out.println(calculadora.divisao(numero1, numero2));
                    break;
                }
                case 5: {
                    System.out.println(calculadora.exponencial(numero1, numero2));
                    break;
                }
                case 6: {
                    System.out.println(calculadora.raiz(numero1));
                    break;
                }
                case 7: {
                    System.out.println(calculadora.piso(numero1));
                    break;
                }
                case 8: {
                    System.out.println(calculadora.teto(numero1));
                    break;
                }

                default:
                    System.out.println("Digite um número entre 0 e 8");
                    break;
            }

        }
        scanner.close();
    }
}

