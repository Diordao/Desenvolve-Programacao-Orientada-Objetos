import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EstrategiaPublicacaoTest {

    @Test
    public void testPublicarLivro() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        try {
            System.setOut(new PrintStream(out));
            EstrategiaPublicacao estrategia = new EstrategiaPublicacaoLivro();
            estrategia.publicar();
            String s = out.toString().trim();
            assertTrue(s.contains("Publicando um livro"));
        } finally {
            System.setOut(original);
        }
    }

    @Test
    public void testPublicarArtigo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        try {
            System.setOut(new PrintStream(out));
            EstrategiaPublicacao estrategia = new EstrategiaPublicacaoArtigo();
            estrategia.publicar();
            String s = out.toString().trim();
            assertTrue(s.contains("Publicando um artigo"));
        } finally {
            System.setOut(original);
        }
    }
}