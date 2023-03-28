//classe lampada
public class lampada {
    
    //variavel de visibilidade privada para mostrar o estado da lampada
    private String estadoLampada = "apagada";
    
    //metodo acende
    public void acende () {
        estadoLampada = "Acesa";
    }
    //metodo apaga
    public void apaga () {
        estadoLampada = "Apagada";
    }
    //metodo para mostrar o resultado
    public void mostraEstado () {
        if (estadoLampada.equals("Acesa")) {
            System.out.println("Está acesa!");
        }
        else {
            System.out.println("Está Apagado!");
        }
    }
}

