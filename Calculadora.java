public class Calculadora {
    public  double soma(double numero1, double numero2) {

        return numero1 + numero2;
    }

    public double subtracao(double numero1, double numero2) {

        return numero1 - numero2;
    }

    public double multiplicacao(double numero1, double numero2) {

        return numero1 * numero2;
    }

    public double divisao(double numero1, double numero2) {

        return numero1 / numero2;
    }

    public double exponencial(double numero1, double numero2) {

        return (double) Math.pow(numero1, numero2);
    }
    public double raiz(double numero1) {

        return (double) Math.sqrt(numero1);
    }
    public int piso(double numero1){
        return (int) Math.floor(numero1);

    }
    public int teto(double numero1){
        return (int) Math.ceil(numero1);

    }

}
