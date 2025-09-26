import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class UsuarioTest {

    @Test
    public void testUsuarioGetters() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertEquals("Gabriel", usuario.getNome());
        assertEquals(21, usuario.getIdade());
    }

    @Test
    public void testHistoricoEmprestimosAoCriarEmprestimo() {
        Usuario usuario = new Usuario("Gabriel", 21);
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia");
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
        assertTrue(usuario.getHistoricoEmprestimos().contains(emprestimo));
        assertEquals(1, usuario.getHistoricoEmprestimos().size());
    }
}