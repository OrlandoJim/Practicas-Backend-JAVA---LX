package practicaMona;

public class Mona {
    String nombre, creador;
    int version;

    Mona(String nombre, String creador, int version){
        this.nombre = nombre;
        this.creador = creador;
        this.version = version;
    }

    public String getNombre() {  return nombre;  }
    public String getCreador() {  return creador;  }
    public int getVersion() {  return version;  }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setCreador(String creador){
        if (!creador.isEmpty()){
            this.creador =creador;
            return true;
        } else
            return false;
    }

    public boolean setVersion(int version){
        if (version > 0){
            this.version =version;
            return true;
        } else
            return false;
    }

    void actividad(){  System.out.println("Está mona tiene muchas actividades"); }
}
