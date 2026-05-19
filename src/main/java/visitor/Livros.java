package visitor;

public class Livros implements ItemBiblioteca{

    private String titulo;

    public Livros(String titulo) {
        this.titulo= titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    @Override
    public String aceitar(Visitor visitor){
        return visitor.visitarLivros(this);
    }
}
