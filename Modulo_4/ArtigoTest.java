import org.junit.Test;
import static org.junit.Assert.*;

public class ArtigoTest {

    @Test
    public void testArtigoGetters() {
        Autor autor = new Autor("Carlos Silva", "Brasileiro", false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }

    @Test
    public void testSetPublicado() {
        Autor autor = new Autor("Ana Costa", "Portuguesa", false);
        Artigo artigo = new Artigo("Compiladores Avançados", autor, "educação", false);

        assertFalse(artigo.isPublicado());
        artigo.setPublicado(true);
        assertTrue(artigo.isPublicado());
    }
}