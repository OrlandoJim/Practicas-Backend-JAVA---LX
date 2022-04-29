public class GhostSpider extends Spiderman implements GhostSpiderHabilidades{
    public GhostSpider(String nombre, String colorTraje, String genero){
        super(nombre, colorTraje, genero);
    }

    @Override
    public void FuerzaSobreHumana(Screen s) {
        s.repaint();
        s.out("\nFuerza Sobrehumana\n");
        s.showImage("ghost/fuerza.jpg");
        s.setBounds(200,100,1000,900);
    }

    @Override
    public void Resistencia(Screen s) {
        s.repaint();
        s.out("\nResistencia Sobrehumana\n");
        s.showImage("ghost/resistencia.jpg");
        s.setBounds(200,100,1000,900);
    }

    @Override
    public void Agilidad(Screen s) {
        s.repaint();
        s.out("\nAgilidad Sobrehumana\n");
        s.showImage("ghost/agilidad.jpg");
        s.setBounds(200,100,1000,900);
    }

    @Override
    public void TrepaMuros(Screen s) {
        s.repaint();
        s.out("\nTrepa muros\n");
        s.showImage("ghost/trepamuros.jpg");
        s.setBounds(200,100,1000,900);
    }

    @Override
    public void SentidoAracnido(Screen s) {
        s.repaint();
        s.out("\nSentido arácnido\n");
        s.showImage("ghost/sentido.jpg");
        s.setBounds(200,100,1000,900);
    }

}
