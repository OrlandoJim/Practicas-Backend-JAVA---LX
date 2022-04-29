public class MilesMorales extends Spiderman implements  MilesMoralesHabilidades{
    public MilesMorales(String nombre, String colorTraje, String genero){
        super(nombre, colorTraje, genero);
    }

    @Override
    public void Fuerza(Screen s) {
        s.setVisible(true);
        s.out("\nFuerza Sobrehumana\n");
        s.showImage("miles/Fuerza.jpg");
        s.setBounds(200,100,1000,900);
    }

    @Override
    public void Agilidad(Screen s) {
        s.repaint();
        s.out("\nAgilidad sobrehumana\n");
        s.showImage("miles/Agilidad.jpg");
        s.setBounds(200,100,1000,900);
    }

    @Override
    public void Resistencia(Screen s) {
        s.repaint();
        s.out("\nResistencia Sobrehumana\n");
        s.showImage("miles/resistencia.jpg");
        s.setBounds(200,100,1000,900);
    }

    @Override
    public void TrepaMuros(Screen s) {
        s.repaint();
        s.out("\nTrepa muros\n");
        s.showImage("miles/trepamuros.jpg");
        s.setBounds(200,100,1000,900);
    }

    @Override
    public void SentidoAracnido(Screen s) {
        s.repaint();
        s.out("\nSentido arácnido\n");
        s.showImage("miles/sentido aracnido.jpg");
        s.setBounds(200,100,1000,900);
    }

    @Override
    public void RayoVenenoso(Screen s) {
        s.repaint();
        s.out("\nRayo venenoso\n");
        s.showImage("miles/rayo venenoso.jpg");
        s.setBounds(200,100,1000,900);
    }

    @Override
    public void ExplosionEnergia(Screen s) {
        s.repaint();
        s.out("\nExplosion de energia\n");
        s.showImage("miles/explosion de energia.jpg");
        s.setBounds(200,100,1000,900);
    }

    @Override
    public void CamuflajeAracnido(Screen s) {
        s.repaint();
        s.out("\nCamuflaje arácnido\n");
        s.showImage("miles/camuflaje.jpg");
        s.setBounds(200,100,1000,900);
    }
}
