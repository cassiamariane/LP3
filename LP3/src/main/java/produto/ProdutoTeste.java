package produto;
import javax.swing.JOptionPane;
public class ProdutoTeste {

    public static void main(String[] args) {
        String nomeDoProduto = JOptionPane.showInputDialog(null,"Escreva o nome do produto: ");
        Produto novoProduto = new Produto(nomeDoProduto);
        JOptionPane.showMessageDialog(null, "Nome do novo produto: " + novoProduto);
    }
    
}
