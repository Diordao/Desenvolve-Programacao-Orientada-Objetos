import org.junit.Test;
import static org.junit.Assert.*;

public class AutorTest {

    @Test
    public void testAutorGetters() {
        Autor autor = new Autor("Alan Turing", "Inglês");
        assertEquals("Alan Turing", autor.getNome());
        assertEquals("Inglês", autor.getNacionalidade());
    }

    @Test
    public void testAdicionarObraPublicada() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia");
        assertEquals(1, autor.getObrasPublicadas().size());
        assertTrue(autor.getObrasPublicadas().contains(livro));
    }
}