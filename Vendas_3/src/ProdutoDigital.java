public class ProdutoDigital extends Produto{
    private double tamanhoMB;
    public ProdutoDigital(String nome, double preco, int estoque, double tamanhoMB){
        super(nome, preco, estoque);
        setTamanhoMB(tamanhoMB);
    }

    //Getter
    public double getTamanhoMB(){ return tamanhoMB;}

    //Setter
    public void setTamanhoMB(double tamanhoMB){
        if(tamanhoMB <= 0){
            System.out.println("Tamanho inválido!");
        }else{
        this.tamanhoMB = tamanhoMB;
        }
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Tamanho: " +  getTamanhoMB());
    }

    @Override
    public void vender(int quantidade){
        System.out.println("\nVenda Realizada! " + getNome() + " vendido para " + quantidade + " clientes");
    }
}
