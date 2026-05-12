public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque){
        setNome(nome);
        setPreco(preco, false);
        setEstoque(estoque, false);
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
    public void setNome(String nome){
        if(nome == null || nome.isBlank()){
            System.out.println("Erro: Nome não pode ser vazio.");
        }else{
            this.nome = nome;
        }
    }

    public void setPreco(double preco, boolean mostrar){
        if(preco < 0){
            mensagem(mostrar, "\nErro ao atualizar preço de " + getNome() + ": Valor negativo.");
        }else {
            this.preco = preco;
            mensagem(mostrar,"\nPreço de " + getNome() + " atualizado com sucesso!");
        }
    }

    public void setEstoque(int estoque, boolean mostrar){
        if(estoque < 0){
            mensagem(mostrar,"\nErro ao atualizar estoque de " + getNome() + ": Valor negativo.");
        }else{
            this.estoque = estoque;
            mensagem(mostrar, "\nEstoque de " + getNome() + " atualizado com sucesso!");
        }
    }

    public void exibirInfo(){
        System.out.println("\nNome: " + getNome());
        System.out.printf("Preço: R$ %.2f%n", getPreco());
        System.out.println("Estoque: " + getEstoque());
    }

    public void vender(int quantidade){
        if (quantidade <= 0) {
            mensagem(true, "\nErro: Quantidade inválida.");
        }else if(quantidade > getEstoque()){
            mensagem(true,"\nErro: Estoque insuficiente.");
        }else{
            setEstoque(getEstoque() - quantidade, true);
            mensagem(true,"\nVenda realizada! Estoque atual de " + getNome() + ": " + getEstoque());
        }
    }

    private void mensagem(boolean mostrar, String msg){
        if(mostrar){
            System.out.println(msg);
        }
    }
}
