public class Autor {
    private String nameAutor;
    private String surnameAutor;

    public Autor(String nameAuthor, String surnameAuthor) {
        this.nameAutor = nameAuthor;
        this.surnameAutor = surnameAuthor;
    }

    public String getNameAutor() {
        return this.nameAutor;
    }

    public String getSurnameAuthor() {
        return this.surnameAutor;
    }

    @Override
    public String toString() {
        return "Имя и фамилия автора: " + nameAutor + " " + surnameAutor;
    }

    @Override
    public boolean equals(Autor autor) {
        if (nameAutor.equals(autor.getNameAutor()) && surnameAutor.equals(surnameAutor.getSurnameAutor())) {
            return true;
        } else {
            return false;
        }
    }

}

