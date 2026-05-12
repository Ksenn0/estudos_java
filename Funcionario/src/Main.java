public class Main {
    public static void main(String[] args){
        Gerente g1 = new Gerente("Sofia", 8000, 12000);
        Estagiario e1 = new Estagiario("Mauro", 1500, 48);

        g1.exibirInfo();
        e1.exibirInfo();
    }
}
