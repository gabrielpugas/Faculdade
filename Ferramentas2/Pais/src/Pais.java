import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String codigo;
    private String nome;
    private int populacao;
    private double dimensao;
    private List<Pais> vizinhos = new ArrayList<Pais>();

    public Pais(){
        this("","",0,0); //não é necessário, pois o java já seta os valores padrão
    }
    public Pais(String codigo, String nome, int populacao, double dimensao) {
        this.codigo = codigo;
        this.nome = nome;
        setPopulacao(populacao);
        setDimensao(dimensao);
        vizinhos = new ArrayList<Pais>();
    }

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

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        if(populacao>=0)
            this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        if(dimensao>=0)
            this.dimensao = dimensao;
    }

    public double getDensidade(){
        return populacao/dimensao;
    }

    public boolean addVizinho(Pais vizinho){
         return vizinhos.add(vizinho);
    }

    public List<Pais> getVizinhos() {
        return vizinhos;
    }

    public List<Pais> vizinhosComuns(Pais outro){
        List<Pais> vizinhosComuns = new ArrayList<Pais>();
        for (Pais p1 : vizinhos)
            for (Pais p2 : outro.getVizinhos())
                if(p1==p2)
                    vizinhosComuns.add(p1);
        return vizinhosComuns;

    }
}
