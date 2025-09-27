import org.junit.Test;
import static org.junit.Assert.*;

public class AutorTest {

    @Test
    public void testAutorGetters() {
        Autor autor = new Autor("Alan Turing", "Inglês", false);
        assertEquals("Alan Turing", autor.getNome());
        assertEquals("Inglês", autor.getNacionalidade());
        assertFalse(autor.isUsuario());
    }

    @Test
    public void testAdicionarObraPublicada() {
        Autor autor = new Autor("Jess", "Brasileira", false);
        Livro livro = new Livro("Java Basico", autor, "tecnologia");
        assertEquals(1, autor.getObrasPublicadas().size());
        assertTrue(autor.getObrasPublicadas().contains(livro));
    }

    @Test
    public void testAutorQueTambemEhUsuario() {
        Autor autor = new Autor("Maria", "Brasileira", true);
        assertTrue(autor.isUsuario());
    }
}