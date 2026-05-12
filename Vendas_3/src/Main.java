public class Main {
    public static void main(String[] args){
        ProdutoFisico pf = new ProdutoFisico("Teclado", 150, 10, 0.8);
        ProdutoDigital pd = new ProdutoDigital("Curso Java", 49, 999, 2.5);

        pf.exibirInfo();
        pd.exibirInfo();

        pf.vender(11);
        pd.vender(9999);
    }
}
