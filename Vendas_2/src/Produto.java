public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Getters
    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getEstoque(){
        return estoque;
    }

    // Setters
    public void setPreco(double preco){
        System.out.println("\nProduto: " + getNome());
        if(preco < 0){
            System.out.println("Erro ao atualizar preço: Valor negativo.");
        }else {
            this.preco = preco;
            System.out.println("Preço atualizado com sucesso!");
        }
    }

    public void setEstoque(int estoque){
        System.out.println("\nProduto: " + getNome());
        if(estoque < 0){
            System.out.println("Erro ao atualizar estoque: Valor negativo.");
        }else{
            this.estoque = estoque;
            System.out.println("Estoque atualizado com sucesso!");
        }
    }

    public void exibirInfo(){
        System.out.println("\nNome: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Estoque: " + getEstoque());
    }

    public void vender(int quantidade){
        if(quantidade > this.estoque){
            System.out.println("\nEstoque insuficiente.");
        }else{
            this.estoque = this.estoque - quantidade;
            System.out.println("\nVenda realizada! Estoque atual de " + getNome() + ": " + getEstoque());
        }
    }
}
