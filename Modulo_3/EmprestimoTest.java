import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class EmprestimoTest {

    @Test
    public void testEmprestimoGettersEefeitos() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Autor autor = new Autor("Alan Turing", "Inglês");
        Livro livro = new Livro("Java Basics", autor, "Tecnologia");
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
        assertEquals(livro, emprestimo.getLivro());
        assertEquals(usuario, emprestimo.getUsuario());
        assertFalse(livro.isDisponivel());
    }
}