/**
 *Escreva uma classe chamada TesteCirculo. Esta deve ser a classe principal (que tem o método main()), que fará uso da classe
 *Circulo (codificada ao lado). A classe TesteCirculo primeiro criará(instanciará) um objeto Circulochamado circulo1, 
 *com um valor de raio igual a 5.0 e deverá “imprimir” na tela, o valor do perímetro desse círculo.
*/
package circulo;

public class CirculoTeste {

    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo (5.00);
        double perimetroCirculo1 = circulo1.calcularPerimetro();
        System.out.println("O valor do perímetro do círculo 1 é: " + perimetroCirculo1);
        
    }
    
}
