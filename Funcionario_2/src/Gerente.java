public class Gerente extends Funcionario implements Tributavel{
    private double bonus;

    // Constructor
    public Gerente(String nome, double salarioBase, double bonus){
        super(nome, salarioBase);
        setBonus(bonus);
    }

    // Getters
    public double getBonus(){ return bonus; }

    // Setters
    public void setBonus(double bonus){
        if(bonus <= 0){
            super.error("Bonus precisa ser maior que 0.");
        }else{
            this.bonus = bonus;
        }
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.printf("Bonus: R$ %.2f%n", getBonus());
        System.out.printf("Salário final: R$ %.2f%n", calcularSalario());
    }

    @Override
    public double calcularSalario(){
        return super.getSalarioBase() + getBonus();
    }

    @Override
    public double calcularImposto(){
        return calcularSalario() * 0.275;
    }
}