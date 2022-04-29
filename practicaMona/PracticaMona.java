package practicaMona;

public class PracticaMona {
    public static void main(String[] args) {
        Mona jetpack = new Jetpacktocat("Jetpacktocat","Tonyjaramillo", 116);
        Mona luchador = new Luchadortocat("Luchadortocat", "Jeejkang, Johncreek", 113);
        Mona DaftpunkT = new DaftpunktocatThomas("Daftpunktocat-Thomas", "JeejKang", 100);
        Mona DaftpunkG = new DaftpunktocatGuy("Daftpunktocat-Guy", "JeejKang", 99);
        Mona spider = new Spidertocat("Spidertocat", "JeejKang", 87);
        Mona surf = new Surftocat("Surftocat", "JeejKang", 138);
        mostrar(jetpack);
        mostrar(luchador);
        mostrar(DaftpunkT);
        mostrar(DaftpunkG);
        mostrar(spider);
        mostrar(surf);
    }

    public static void mostrar(Mona m){
        System.out.println("\nNombre: " + m.nombre +
                "\nCreador(es): " + m.creador +
                "\nVersion: " + m.version +
                "\nHobbie: ");

        m.actividad();
    }
}
