package ribeiro.silveira.vinicius.javaChalangeSpring.model;

public class Marcas {

    private String codigo;
    private String nome;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " - Marca: " + nome;
    }
}
