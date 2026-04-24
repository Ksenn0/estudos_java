import java.util.Scanner;

public class Classificador {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é a sua idade? ");
        int idade = sc.nextInt();
        System.out.print("Qual é a sua nota? ");
        double nota = sc.nextDouble();
        sc.close();

        String faixaEtaria, situacao;
        if(idade >= 18){
            faixaEtaria = "Adulto";
        }else if (idade < 13){
            faixaEtaria = "Criança";
        }else{
            faixaEtaria = "Adolescente";
        }

        if(nota < 5){
            situacao = "Reprovado";
        } else if (nota >= 7) {
            situacao = "Aprovado";
        }else{
            situacao = "Recuperação";
        }

        System.out.println("Faixa Etária: " + faixaEtaria);
        System.out.println("Situação: " + situacao);
    }
}