public class SpiderVerse {
    public static void main(String[] args) {
        TestSpiderVerse();
    }

    private static void TestSpiderVerse(){
        Screen s = new Screen();

        SpiderHam spiderHam = new SpiderHam("Spider-Ham", "Rojo y Azul", "Masculino / Animal");
        GhostSpider ghostSpider = new GhostSpider("Ghost-Spider", "Blanco y rojo","Femenino");
        MilesMorales milesMorales = new MilesMorales("Miles Morales", "Negro y rojo", "Masculino");

        Runnable ataques = new Runnable() {
            @Override
            public void run() {
                Dialog d = new Dialog();
                String str;
                str = d.readString("¿Cual variante de Spiderman quieres ver? \n 1 / 2 / 3");
                if  (str.charAt(0) == '1'){
                    try {

                        s.out(spiderHam.showMessage());

                        spiderHam.Adherirse(s);
                        Thread.sleep(3000);

                        spiderHam.SentidoAracnido(s);
                        Thread.sleep(3000);

                        spiderHam.SpiderMazo(s);
                        Thread.sleep(3000);

                        spiderHam.LanzarTelaraña(s);
                        Thread.sleep(3000);
                    } catch (InterruptedException ie){
                        ie.printStackTrace();
                    }
                } else if (str.charAt(0) == '2'){
                    try {

                        s.out(ghostSpider.showMessage());

                        ghostSpider.FuerzaSobreHumana(s);
                        Thread.sleep(3000);

                        ghostSpider.Agilidad(s);
                        Thread.sleep(3000);

                        ghostSpider.Resistencia(s);
                        Thread.sleep(3000);

                        ghostSpider.TrepaMuros(s);
                        Thread.sleep(3000);

                        ghostSpider.SentidoAracnido(s);
                        Thread.sleep(3000);
                    } catch (InterruptedException ie){
                        ie.printStackTrace();
                    }
                } else if ( str.charAt(0) == '3'){
                    try {

                        s.out(milesMorales.showMessage());

                        milesMorales.Fuerza(s);
                        Thread.sleep(3000);

                        milesMorales.Agilidad(s);
                        Thread.sleep(3000);

                        milesMorales.Resistencia(s);
                        Thread.sleep(3000);

                        milesMorales.TrepaMuros(s);
                        Thread.sleep(3000);

                        milesMorales.SentidoAracnido(s);
                        Thread.sleep(3000);

                        milesMorales.RayoVenenoso(s);
                        Thread.sleep(3000);

                        milesMorales.ExplosionEnergia(s);
                        Thread.sleep(3000);

                        milesMorales.CamuflajeAracnido(s);
                        Thread.sleep(3000);
                    } catch (InterruptedException ie){
                        ie.printStackTrace();
                    }
                }
            }
        };

        Thread ataquesSpiderHam = new Thread(ataques);
        ataquesSpiderHam.start();
    }
}
