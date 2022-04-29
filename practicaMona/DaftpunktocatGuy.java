package practicaMona;

public class DaftpunktocatGuy extends Mona{
    DaftpunktocatGuy(String nombre, String creador, int version){
        super(nombre,creador,version);
    }

    @Override
    void actividad() {
        System.out.println("Esta version de Mona le gusta hacer excelentes cover de Daftpunk con Daftpunktocat-Thomas");
    }
}
