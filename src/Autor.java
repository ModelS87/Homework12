public class Autor {
    private String nameAutor;
    private String surnameAutor;
    public Autor (String nameAuthor, String surnameAuthor) {
        this.nameAutor = nameAuthor;
        this.surnameAutor = surnameAuthor;
    }
    public String getNameAutor(){
        return this.nameAutor;
    }
    public String getSurnameAuthor(){
        return this.surnameAutor;
    }
}
