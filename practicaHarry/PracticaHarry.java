package practicaHarry;

public class PracticaHarry {
    public static void main(String[] args) {
        System.out.println("Bienvenido a howards\nAqui tienes algunos de los alumnos destacados:");

        Harry harry = new Harry("Harry Potter", "Masculino", "Gryffindor", "Dementor", "Ciervo");

        Hermione hermione = new Hermione();
        hermione.setNombre("Hermione Granger");
        hermione.setGenero("Femenino");
        hermione.setCasa("Gryffindor");
        hermione.setBoggart("Profesora McGonagall");
        hermione.setPatronus("Nutria");

        Ron ron = new Ron("Ronald Weasley","Masculino","Gryffindor", "Araña Gigante", "Jack Russell Terrier");

        Draco draco = new Draco();
        draco.setNombre("Draco Malfoy");
        draco.setGenero("Masculino");
        draco.setCasa("Slytherin");
        draco.setBoggart("Lord Voldemort");
        draco.setPatronus("?");

        Luna luna = new Luna("Luna Lovegood", "Femenino", "Ravenclaw", "Ver morir a su padre", "Liebre");

        System.out.println(harry.showMessage());
        System.out.println(hermione.showMessage());
        System.out.println(ron.showMessage());
        System.out.println(draco.showMessage());
        System.out.println(luna.showMessage());

    }

}
