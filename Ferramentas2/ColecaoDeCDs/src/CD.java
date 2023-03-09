import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CD {
    private List<Musica> faixas = new ArrayList<Musica>();
    private String nome;
    private String artista;
    private int anoDeLancamento;

    public CD (String nome, String artista, int anoDeLancamento){
        setNome(nome);
        setArtista(artista);
        setAnoDeLancamento(anoDeLancamento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void addFaixa(Musica faixa){
        faixas.add(faixa);
    }

    public void getFaixas(){
        int i = 1;
        for (Musica musica:faixas
        ) {
            System.out.println("Música "+i+" - "+musica.getNome()+" - "+"Duração: "+musica.getDuracao());
            i++;
        }
    }
}
