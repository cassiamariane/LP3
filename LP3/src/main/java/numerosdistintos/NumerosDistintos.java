package numerosdistintos;
import java.util.ArrayList;
import java.util.Scanner;

public class NumerosDistintos {
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Ingresse números inteiros (0 para finalizar): ");
        int valor;

        do{
            valor = input.nextInt();
            if(!lista.contains(valor) && valor != 0)
                lista.add(valor);
        }while(valor != 0);
        
        for(int i = 0; i < lista.size(); i++)
            System.out.print(lista.get(i)+" ");

        System.out.print("\n"+lista.toString());
    }
}
