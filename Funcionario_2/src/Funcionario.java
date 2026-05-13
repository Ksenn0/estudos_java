public class Funcionario {
    private String nome;
    private double salarioBase;

    // Constructor
    public Funcionario(String nome, double salarioBase){
        setNome(nome);
        setSalarioBase(salarioBase);
    }

    // Getters
    public String getNome(){ return nome; }

    public double getSalarioBase(){ return salarioBase; }

    // Setters
    public void setNome(String nome){
        if(nome == null || nome.isBlank()){
            error("Nome não pode ser vazio.");
        }else{
            this.nome = nome;
        }
    }

    public void setSalarioBase(double salarioBase){
        if(salarioBase <= 0){
            error("O salário deve ser maior que zero.");
        }else{
            this.salarioBase = salarioBase;
        }
    }

    // Exibir informações do funcionário
    public void exibirInfo(){
        System.out.println("\nNome: " + getNome());
        System.out.printf("Salário base: R$ %.2f%n", getSalarioBase());
    }

    // Salário ajustado
    public double calcularSalario(){
        return getSalarioBase();
    }

    // Error
    protected void error(String msg){
        System.out.println("\nERRO: " + msg);
    }
}
