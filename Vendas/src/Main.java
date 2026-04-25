public class Main {
    public static void main(String[] args){
        Produto p1 = new Produto("Teclado", 22, 10);
        Produto p2 = new Produto("Mouse", 12.50, 10);

        p1.exibirInfo();
        p2.exibirInfo();

        p1.vender(3);
        p2.vender(20);
    }
}
