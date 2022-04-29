public class Comic {
    private String titulo;
    private int paginas;
    private int numEdicion;

    public Comic(String titulo, int paginas, int numEdicion){
        this.titulo = titulo;
        this.paginas = paginas;
        this.numEdicion = numEdicion;
    }

    public String getTitulo() {  return titulo;  }
    public int getPaginas() {  return paginas;  }
    public int getNumEdicion() {  return numEdicion;  }

    public boolean setTitulo(String titulo){
        if(!titulo.isEmpty()){
            this.titulo = titulo;
            return true;
        } else
            return false;
    }

    public boolean setPaginas(int paginas){
        if (paginas > 0){
            this.paginas = paginas;
            return true;
        } else
            return false;
    }

    public boolean setNumEdicion(int numEdicion){
        if (numEdicion > 0 ){
            this.numEdicion = numEdicion;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return "Titulo del comic: " + titulo +
                "\nNúmero de edición: "+ numEdicion +
                "\nTotal de páginas: " + paginas;
    }
}
