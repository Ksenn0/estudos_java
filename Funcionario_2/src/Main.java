public class Main {
    public static void main(String[] args){
        Funcionario f1 = new Estagiario("Kenner", 1500, 24);
        Gerente g1 = new Gerente("Cleber", 10000, 5000);

        f1.exibirInfo();
        g1.exibirInfo();

        Tributavel[] tributaveis = {
                g1
        };


        double impostoTotal = 0;
        System.out.println("\n---------- Imposto ----------");
        for(Tributavel t : tributaveis){
            System.out.printf("%s: %.2f%n", ((Funcionario) t).getNome(), t.calcularImposto());
            impostoTotal += t.calcularImposto();
        }

        System.out.printf("Imposto total: R$ %.2f%n", impostoTotal);
    }
}
