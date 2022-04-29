public class Spiderman {

    private String nombre;
    private String colorTraje;
    private String genero;

    public Spiderman(String nombre, String colorTraje, String genero){
        this.nombre = nombre;
        this.colorTraje = colorTraje;
        this.genero = genero;
    }

    public String getNombre(){  return nombre;  }
    public String getColorTraje(){  return colorTraje;  }
    public String getGenero(){  return genero;  }

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean setColorTraje(String colorTraje){
        if (!colorTraje.isEmpty()){
            this.colorTraje = colorTraje;
            return true;
        } else
            return false;
    }

    public boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return "Nombre: " + nombre +
                "\nColor del traje: " + colorTraje +
                "\nGenero: " + genero;
    }
}
