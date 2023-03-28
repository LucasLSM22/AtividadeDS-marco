//inicio da classe
public class resultadoLampada {
    //metodo main
    public static void main (String [] args) {
        lampada lampada = new lampada ();
        
        //chamando os metodos do outro arquivo
        lampada.acende();
        lampada.apaga();
        lampada.mostraEstado();
    }
}
