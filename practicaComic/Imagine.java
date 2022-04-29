import java.awt.*;

public class Imagine extends Comic implements accionesComic{
    public Imagine(String nombre, int paginas, int numEdicion){
        super(nombre,paginas,numEdicion);
    }

    @Override
    public void iniciar(Screen s) {
        s.setVisible(true);
        s.out(showMessage(),"Helvetica", 28, Colors.OrangeHibiscus);
    }
    @Override
    public void mostrarPagina(Screen s, int i){
        s.cls();
        s.repaint();
        s.out(showMessage()+"\n","Helvetica", 28, Colors.OrangeHibiscus);
        s.out("Página "+ i+"\n", "Helvetica", 28, Color.RED);
        s.showImage("img/"+i +".jpg");
        s.setBounds(200,100,800,600);
    }

    @Override
    public void terminar(Screen s) {
        s.cls();
        s.repaint();
        s.out("Hasta luego...\n","Helvetica", 28, Colors.OrangeHibiscus);
    }

    @Override
    public void reiniciar(Screen s) {
        s.cls();
        s.repaint();
        s.out("Aquí vamos de nuevo...\n","Helvetica", 28, Colors.OrangeHibiscus);
    }
}
