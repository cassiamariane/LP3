
package funcionarios;
import java.util.Scanner;

public class FuncionariosTest {

    public static void main(String[] args) {
        
        Funcionario[] funcionarios = new Funcionario[5];
        Scanner in = new Scanner(System.in);
        
        for(int i =0; i<5; i++){
            String nome = in.nextLine();
            funcionarios[i].setNome(nome);
            double salario = in.nextDouble();
            funcionarios[i].setSalario_mensal(salario);
            int horasExtras = in.nextInt();
            funcionarios[i].setNum_horas_extras(horasExtras);
        }
        
        double salario = funcionarios[2].calcular_salario();
        System.out.printf("Salário total = %.2f\n", salario);
    }
    
}
