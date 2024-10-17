public class LlamarClase {
    public static void main(String[] args){
        ClaseJugador one =new ClaseJugador("Juan", 25,"Estados Unidos");
        ClaseJugador two =new ClaseJugador("Richi", 20,"Mexico");
        ClaseJugador three =new ClaseJugador("Walter", 19,"Peru");
        ClaseJugador four =new ClaseJugador("Pedro", 30,"Colombia");
        ClaseJugador five =new ClaseJugador("Luiz", 24,"Argetina");
        ClaseJugador six =new ClaseJugador();

        one.patar();
        two.correr();
        three.saltar();
        four.saltar();
        five.correr();
        six.patar();
    }
}
