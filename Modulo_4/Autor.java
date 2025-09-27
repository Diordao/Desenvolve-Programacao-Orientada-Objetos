import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private String nacionalidade;
    private boolean isUsuario;
    private List<Livro> obrasPublicadas;

    public Autor(String nome, String nacionalidade, boolean isUsuario) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.isUsuario = isUsuario;
        this.obrasPublicadas = new ArrayList<>();
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public boolean isUsuario() {
        return isUsuario;
    }

    public void setUsuario(boolean isUsuario) {
        this.isUsuario = isUsuario;
    }

    public List<Livro> getObrasPublicadas() {
        return obrasPublicadas;
    }

    public void adicionarObra(Livro livro) {
        obrasPublicadas.add(livro);
    }
}