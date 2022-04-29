package practicaMona;

public class Jetpacktocat extends Mona{
    Jetpacktocat(String nombre, String creador, int version){
        super(nombre,creador,version);
    }

    @Override
    void actividad() {
        System.out.println("Esta version de Mona le gusta volar en con su Jetpack");
    }
}
