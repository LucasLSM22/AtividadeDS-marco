//importacao da janela grafica
import javax.swing.JOptionPane;

//inicio da classe exerc1
public class exerc1 {
    //pacote de extensao do nucleo  de java
    public static void main (String [] args) {
        //metodo ler nota
    lerNota ();
    }
    //iniciando metodo ler nota
    static void lerNota(){
        //declaração de variaveis e entrada de dados
        double n1, n2;
        String nome;
        nome = JOptionPane.showInputDialog(null, "Digite um Nome: ");
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 1º nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 2º nota: "));
        JOptionPane.showMessageDialog(null, nome);
        //declarando o metodo calculaMedia com os parametros das variaveis n1, n2, nome
        calculaMedia(n1,n2);
    }
     //iniciando o metodo calculaMedia com novas variaveis 
    private static void calculaMedia (double a1, double a2) {
        //variavel para armazenar o resultado
        double md;
        //formula do calculo
        md=(a1+a2)/2;
        //condicao para aprovado
        if (md > 7) 
            JOptionPane.showMessageDialog(null, "Aprovado com nota: " + md);
        
        else
            //condição exame
            if (md >= 4 && md < 7)
            JOptionPane.showMessageDialog(null, "Exame com nota: " + md);
        //condicao reprovado
        else 
            JOptionPane.showMessageDialog(null, "Reprovado com nota: " + md);
       
    }
}
