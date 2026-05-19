package visitor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisitorTest {

    @Test
    public void deveExibirLivro() {

        Livros livro = new Livros("Java POO");
        ImpressoraVisitor visitor = new ImpressoraVisitor();

        assertEquals(
                "Livro: Java POO",
                livro.aceitar(visitor)
        );
    }

    @Test
    public void deveExibirRevista() {

        Revista revista = new Revista("Tech News");
        ImpressoraVisitor visitor = new ImpressoraVisitor();

        assertEquals(
                "Revista: Tech News",
                revista.aceitar(visitor)
        );
    }
}