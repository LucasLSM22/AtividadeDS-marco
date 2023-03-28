//importacao da janela grafica
import javax.swing.JOptionPane;

public class exerc2 {
    //iniciando metodo main
    public static void main (String [] args) {
        
        //entrada de dados 
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
        //declarando o metodo diferenca com os parametros das variaveis a e b
        diferenca(a, b);
    }
    //iniciando o metodo diferenca com novas variaveis 
    static void diferenca(int n, int m){
        //variavel para armazenar o resultado
        int result;
        
        //testando qual numero é maior
        if(n<m){
            //formula de calculo
            result= m - n;
        }
        else {
            result= n - m;
        }
        //apresentacao do resultado final
        JOptionPane.showMessageDialog(null,"A diferença do maior valor para o menor é: " +result);
    }
}
