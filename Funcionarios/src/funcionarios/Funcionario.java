
package funcionarios;

public class Funcionario{

    private String nome;
    private double salario_mensal;
    private int num_horas_extras;
    
    Funcionario(String nome, double salario_mensal, int num_horas_extras){
        this.nome = nome;
        this.salario_mensal = salario_mensal;
        this.num_horas_extras = num_horas_extras;
    }
    
    public double calcular_salario(){
        double salario_total = salario_mensal + num_horas_extras * 1.5 * (salario_mensal/80);
        return salario_total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario_mensal() {
        return salario_mensal;
    }

    public void setSalario_mensal(double salario_mensal) {
        this.salario_mensal = salario_mensal;
    }

    public int getNum_horas_extras() {
        return num_horas_extras;
    }

    public void setNum_horas_extras(int num_horas_extras) {
        this.num_horas_extras = num_horas_extras;
    }
}
