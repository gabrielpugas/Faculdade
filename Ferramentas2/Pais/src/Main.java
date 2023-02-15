import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Pais> listPaises = new Pais();
        ArrayList<Pais> listPaises = new ArrayList();
        Pais br = new Pais("ISO 3166-1", "Brasil", 213300000, 8514876.849);
        listPaises.add(br);
        System.out.println("Densidade do "+br.getNome()+" = "+br.getDensidade());

        Pais py = new Pais();
        py.setCodigo("ISO 4538-9");
        py.setNome("Paraguai");
        py.setPopulacao(6704000);
        py.setDimensao(406752);
        listPaises.add(py);
        System.out.println("Densidade do "+py.getNome()+" = "+py.getDensidade());

        listPaises.add(new Pais("ISO 3166-2","Chile",19490000,756950));

        for(int i=0; i<listPaises.size(); i++){
            System.out.println("Densidade do "+listPaises.get(i).getNome()+" = "+listPaises.get(i).getDensidade());
        }
        for (Pais p:listPaises) {
            System.out.println("Densidade do "+p.getNome()+" = "+p.getDensidade());
        }

        Continente americaDoSul = new Continente("América do Sul");

        americaDoSul.addPais(br);
        americaDoSul.addPais(py);

        br.addVizinho(py);
        py.addVizinho(cl);

        System.out.println(americaDoSul.razaoMaiorMenorPais());

        br.getVizinhos().forEach((vizinho)->{
            System.out.println(vizinho.getNome());
        });

        br.vizinhosComuns(py).forEach((comuns)->{
            System.out.println(comuns.getNome());
        });
    }
}
