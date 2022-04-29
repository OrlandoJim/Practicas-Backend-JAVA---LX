package practicaMona;

public class Luchadortocat extends Mona{

    Luchadortocat(String nombre, String creador, int version){
        super(nombre,creador,version);
    }

    @Override
    void actividad() {
        System.out.println("Esta version de Mona le gusta practicar la lucha libre");
    }
}
