import java.util.Scanner;

public class Calculadora {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        sc.close();

        System.out.println("Soma: " + soma(a, b));
        System.out.println("Subtração: " + subtracao(a, b));
        System.out.println("Multiplicação: " + multiplicacao(a, b));
        System.out.println("Divisão: " + divisao(a, b));
    }
    static double soma(double a, double b){
        return(a + b);
    }

    static double subtracao(double a, double b){
        return(a - b);
    }

    static double multiplicacao(double a, double b){
        return(a * b);
    }

    static double divisao(double a, double b){
        if(b == 0){
            System.out.println("Erro: Divisão por 0");
            return 0;
        }else{
            return(a / b);
        }
    }
}
