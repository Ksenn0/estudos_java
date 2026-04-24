import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char loop = 's';
        int number;
        while(loop != 'n'){
            System.out.print("Digite um número para ver a tabuada: ");
            number = sc.nextInt();

            System.out.println("\n----- Tabuada do " + number + " -----");
            for (int i = 1; i <= 10; i++){
                System.out.println(number + " x " + i + " = " + number*i);
            }

            System.out.print("\nDeseja ver outra tabuada? (s/n): ");
            sc.nextLine();
            loop = sc.nextLine().charAt(0);
        }

        sc.close();
        System.out.println("Encerrando...");
    }
}