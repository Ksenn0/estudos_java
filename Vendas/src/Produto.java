public class Produto {
    String nome;
    double preco;
    int estoque;

    Produto(String nome, double preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    void exibirInfo(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Estoque: " + this.estoque);
    }

    void vender(int quantidade){
        if(quantidade > this.estoque){
            System.out.println("\nEstoque insuficiente.");
        }else{
            this.estoque = this.estoque - quantidade;
            System.out.println("\nVenda realizada! Estoque atual de " + this.nome + ": " + this.estoque);
        }
    }
}
