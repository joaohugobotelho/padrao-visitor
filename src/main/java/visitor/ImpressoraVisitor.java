package visitor;

public class ImpressoraVisitor implements Visitor{

    @Override
    public String visitarLivros(Livros livros){
        return "Livro: " + livros.getTitulo();
    }

    @Override
    public String visitarRevista(Revista revista){
        return "Revista: " + revista.getNome();
    }
}
