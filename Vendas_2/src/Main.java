public class Main {
    public static void main(String[] args){
        Produto p1 = new Produto("Teclado", 25, 10);
        Produto p2 = new Produto("Mouse", 12.50, 10);

        p1.exibirInfo();
        p2.exibirInfo();

        p1.setPreco(-15.75);
        p1.setEstoque(-3);
        p2.setPreco(-33.25);
        p2.setEstoque(-35);

        p1.setPreco(150.75);
        p1.setEstoque(15);
        p2.setPreco(49.90);
        p2.setEstoque(25);

        p1.exibirInfo();
        p2.exibirInfo();

        p1.vender(3);
        p2.vender(20);
    }
}
