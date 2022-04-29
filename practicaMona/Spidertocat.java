package practicaMona;

public class Spidertocat extends Mona{
    Spidertocat(String nombre, String creador, int version){
        super(nombre,creador,version);
    }

    @Override
    void actividad() {
        System.out.println("Esta version de Mona le gusta salvar a todos con su traje de Spiderman");
    }
}
