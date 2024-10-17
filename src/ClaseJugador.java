public class ClaseJugador {
    String avatar;
    int edad;
    String pais;

    public ClaseJugador(String avatar,int edad,String pais) {
        this.avatar = avatar;
        this.edad= edad;
        this.pais=pais;
    }
    public ClaseJugador() {
        avatar = "Ivan206";
        edad= 20;
        pais= "ECUADOR";
    }
    public void patar(){
        System.out.println("JUGADOR 1");
        System.out.println("-------------------------------");
        System.out.println("El Avatar es: "+avatar);
        System.out.println("La Edad del jugador es: "+edad);
        System.out.println("El pais del jugador es: "+pais);
        System.out.println("El jugador patea.");
        System.out.println("-------------------------------");
    }
    public void correr(){
        System.out.println("JUGADOR 1");
        System.out.println("-------------------------------");
        System.out.println("El Avatar es: "+avatar);
        System.out.println("La Edad del jugador es: "+edad);
        System.out.println("El pais del jugador es: "+pais);
        System.out.println("El jugador corre.");
        System.out.println("-------------------------------");
    }
    public void saltar(){
        System.out.println("JUGADOR 2");
        System.out.println("-------------------------------");
        System.out.println("El Avatar es: "+avatar);
        System.out.println("La Edad del jugador es: "+edad);
        System.out.println("El pais del jugador es: "+pais);
        System.out.println("El jugador salta.");
        System.out.println("-------------------------------");
    }
}