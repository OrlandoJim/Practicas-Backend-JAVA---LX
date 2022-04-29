public class LeerComic {
    public static void main(String[] args) {
        Screen s = new Screen();
        Imagine imagine = new Imagine("Imagine",34, 1);
        Dialog d = new Dialog();
        String str;
        Runnable leer = new Runnable() {
            @Override
            public void run() {
                String str;
                try {
                    imagine.iniciar(s);
                    Thread.sleep(2500);

                    for (int i = 1; i<= imagine.getPaginas(); i++){
                        imagine.mostrarPagina(s,i);
                        Thread.sleep(3500);
                    }
                    str = d.readString("¿Quieres terminar de leer o reiniciar el comic? T/R");
                    if (str.charAt(0) == 'R' || str.charAt(0) == 'r'){
                        imagine.reiniciar(s);
                        Thread.sleep(3000);
                        run();
                    } else{
                        imagine.terminar(s);
                        Thread.sleep(3000);
                        s.setVisible(false);
                        System.exit(0);
                    }

                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        Thread leerImagine = new Thread(leer);
        leerImagine.start();
    }
}
