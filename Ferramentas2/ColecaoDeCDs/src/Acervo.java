import java.util.ArrayList;
import java.util.List;

public class Acervo {
    private List<CD> cds = new ArrayList<CD>();
    public Acervo (){ }
    public void addCD(CD cd) {
        cds.add(cd);
    }

    public void getCds() {
        int i = 1;
        for (CD cd:cds
             ) {
            System.out.println("CD "+i+" - "+cd.getNome());
            i++;
        }
    }
}
