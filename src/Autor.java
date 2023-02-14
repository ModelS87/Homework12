import java.util.Objects;

public class Autor {
    private String nameAutor;
    private String surnameAutor;

    public Autor(String nameAutor, String surnameAutor) {
        this.nameAutor = nameAutor;
        this.surnameAutor = surnameAutor;
    }

    public String getNameAutor() {
        return this.nameAutor;
    }

    public String getSurnameAutor() {
        return this.surnameAutor;
    }

    @Override
    public String toString() {
        return "Имя и фамилия автора: " + nameAutor + " " + surnameAutor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Autor autor = (Autor) o;
        return nameAutor.equals(autor.getNameAutor()) && surnameAutor.equals(autor.getSurnameAutor());
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameAutor,surnameAutor);
    }
}


