public class Produto {
    private int id;
    private String nome;
    private double valor;
    private int estoque;

    public Produto(){

    }
    public Produto(int id, String nome, double valor, int estoque){
        setId(id);
        setNome(nome);
        setValor(valor);
        setEstoque(estoque);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
