import java.sql.SQLOutput;

public class App {
    public static void main (String [] args) {
        Autor levTolstoy = new Autor("Lev ","Tolstoy");
        Autor pavelBazov = new Autor("Pavel", "Bazov");
        Autor pavelBazov2 = new Autor("Pavel", "Bazov");
        Book warAndPeace = new Book("War and Peace", levTolstoy,1980);
        Book silverHoof = new Book("Silver Hoof", pavelBazov, 2005);
        Book silverHoof2 = new Book("Silver Hoof1", pavelBazov, 2005);
        System.out.println("Имя автора - " + levTolstoy.getNameAutor());
        warAndPeace.setpublishingYear(2010);
        System.out.println("Новый год выпуска книги - " + warAndPeace.getpublishingYear());
        System.out.println(levTolstoy);
        System.out.println(silverHoof);
        System.out.println();
        System.out.println(pavelBazov.equals(pavelBazov2));
        System.out.println(silverHoof.equals(silverHoof2));
        System.out.println(warAndPeace.hashCode());
        System.out.println(pavelBazov2.hashCode());



    }


}


