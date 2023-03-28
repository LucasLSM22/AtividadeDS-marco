//importacao da janela grafica
import javax.swing.JOptionPane;

public class exerc4 {
    //iniciando metodo main
    public static void main (String [] args) {
        
        //entrada de dados 
        int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base: "));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));
        //declarando o metodo hipotenusa com os parametros das variaveis digitadas
        hipotenusa(base, altura);
    }
    //iniciando o metodo hipotenusa com novas variaveis 
    static void hipotenusa(int b, int a){
        //variavel para armazenar o resultado
        int basefinal=b*b;
        int alturafinal=a*a;
        int result;
        //formula de calculo
        result= basefinal + alturafinal;
        //fazendo o calculo da raiz quadrada
        double r = Math.sqrt(result);
  
        //apresentacao do resultado final
        JOptionPane.showMessageDialog(null,"A hipotenusa é " +r+ "\n formula utilizada: hipotenusa^2= "+ b + "^2 + "+a+"^2 = "+r);
    }
}
