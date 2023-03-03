import java.util.List;

public class Acervo {
    private List<CD> cds;
    public Acervo (){ }
    public void addCD(CD cd){
        cds.add(cd);
    }

    public List<CD> getCds() {
        return cds;
    }
}
