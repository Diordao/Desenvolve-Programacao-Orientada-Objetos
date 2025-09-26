import org.junit.Test;
import static org.junit.Assert.*;

public class LivroTest {

    @Test
    public void testLivroGettersEDisponibilidade() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia");
        assertEquals("Java Basico", livro.getTitulo());
        assertEquals(autor, livro.getAutor());
        assertEquals("tecnologia", livro.getGenero());
        assertTrue(livro.isDisponivel());
    }

    @Test
    public void testAutorRecebeObraAoCriarLivro() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Avancado", autor, "tecnologia");
        assertTrue(autor.getObrasPublicadas().contains(livro));
    }
}