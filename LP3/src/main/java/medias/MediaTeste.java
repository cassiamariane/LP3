/**
 * Escreva uma classe chamada TesteMedia. Esta deve ser a classe principal que testa a classe Media do código da Questão 5.
 * Este novo programa deve apresentar na tela o valor das médias da aluna Maria, com notas 6,23 e 4,12 nas provas; e de Marco,
 * com notas 6,27 e 5,40.
*/
package medias;
import javax.swing.JOptionPane;
public class MediaTeste {
    
    public static void main(String[] args) {
        
       String av1MariaString = JOptionPane.showInputDialog(null,"Escreva a primeira nota de Maria: ");
       double av1MariaDouble = Double.parseDouble(av1MariaString);
       String av2MariaString = JOptionPane.showInputDialog(null,"Escreva a segunda nota de Maria: ");
       double av2MariaDouble = Double.parseDouble(av2MariaString);
       Media mediaDeMaria = new Media (av1MariaDouble,av2MariaDouble);
       Media mediaDeMarco = new Media (6.27, 5.40);
       double mediaMaria = mediaDeMaria.calcularMedia();
       JOptionPane.showMessageDialog(null, "Média da Maria: " + mediaMaria);
       double mediaMarco = mediaDeMarco.calcularMedia();
        System.out.println("Média do Marco: " + mediaMarco);
        
    } 
}
