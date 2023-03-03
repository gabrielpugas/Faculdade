import java.util.Date;
import java.util.List;

public class CD {
    private List<Musica> musicas;
    private String nome;
    private String artista;
    private int anoDeLancamento;

    public CD (String nome, String artista, int anoDeLancamento){
        this.nome = nome;
        this.artista = artista;
        this.anoDeLancamento = anoDeLancamento;
    }
    public void addMusica(Musica musica) {
        musicas.add(musica);
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
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
}
