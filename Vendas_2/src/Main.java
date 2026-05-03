public class Main {
    public static void main(String[] args){
        Produto p1 = new Produto("Teclado", 25, 10);
        Produto p2 = new Produto("Mouse", 12.50, 10);

        p1.exibirInfo();
        p2.exibirInfo();

        p1.setPreco(-15.75, true);
        p1.setEstoque(-3, true);
        p2.setPreco(-33.25, true);
        p2.setEstoque(-35, true);

        p1.setPreco(150.75, true);
        p1.setEstoque(15, true);
        p2.setPreco(49.90, true);
        p2.setEstoque(25, true);

        p1.exibirInfo();
        p2.exibirInfo();

        p1.vender(3);
        p2.vender(20);
    }
}
