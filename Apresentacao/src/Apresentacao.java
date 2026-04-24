import java.util.Scanner;

public class Apresentacao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é o seu nome? ");
        String nome = sc.nextLine();
        System.out.print("Qual é a sua idade? ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Qual é a sua Cidade? ");
        String cidade = sc.nextLine();

        System.out.println("Olá! me chamo " + nome + ", tenho " + idade + " anos e moro em " + cidade);
    }
}
