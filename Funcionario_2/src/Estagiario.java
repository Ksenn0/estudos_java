public class Estagiario extends Funcionario{
    private int cargaHoraria;

    // Constructor
    public Estagiario(String nome, double salarioBase, int cargaHoraria){
        super(nome, salarioBase);
        setCargaHoraria(cargaHoraria);
    }

    // Getters
    public int getCargaHoraria(){
        return cargaHoraria;
    }

    // Setters
    public void setCargaHoraria(int cargaHoraria){
        if(cargaHoraria <= 0 || cargaHoraria > 48){
            super.error("Carga Horaria deve estar entre 1 e 48 horas.");
        }else{
            this.cargaHoraria = cargaHoraria;
        }
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Carga Horaria: " + getCargaHoraria() + "h/semana");
        System.out.printf("Salário final: R$ %.2f%n", calcularSalario());
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() * 0.5;
    }
}
