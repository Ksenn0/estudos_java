public class ProdutoFisico extends Produto{
    private double peso;

    public ProdutoFisico(String nome, double preco, int estoque, double peso){
        super(nome, preco, estoque);
        setPeso(peso);
    }

    //Getter
    public double getPeso(){ return peso; }
    //Setter
    public void setPeso(double peso){
        if(peso <= 0){
            System.out.println("Peso inválido!");
        }else{
        this.peso = peso;
        }
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Peso: " + getPeso() + " Kg");
    }
}
