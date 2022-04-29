public class SpiderHam extends Spiderman implements SpiderHamHabilidades{
    public SpiderHam(String nombre, String colorTraje, String genero){
        super(nombre, colorTraje, genero);
    }

    @Override
    public void Adherirse(Screen s) {
        s.setVisible(true);
        s.out("\nAdherirse\n");
        s.showImage("ham/adherirse.jpg");
        s.setBounds(200,100,1000,900);
    }

    @Override
    public void SentidoAracnido(Screen s) {
        s.repaint();
        s.out("\nSentido arácnido\n");
        s.showImage("ham/sentido.jpg");
        s.setBounds(200,100,1000,900);
    }

    @Override
    public void SpiderMazo(Screen s) {
        s.repaint();
        s.out("\nSpider-Mazo\n");
        s.showImage("ham/mazo.jpg");
        s.setBounds(200,100,1000,900);
    }

    @Override
    public void LanzarTelaraña(Screen s) {
        s.repaint();
        s.out("\nLanzar telaraña\n");
        s.showImage("ham/telaraña.jpg");
        s.setBounds(200,100,1000,900);
    }
}
