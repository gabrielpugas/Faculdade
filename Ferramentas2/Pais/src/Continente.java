import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises = new ArrayList<Pais>();

    public Continente(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean addPais(Pais pais){
        return paises.add(pais);
    }

    public double getDimensao(){
        double dimensaoTotal = 0;
        for (Pais p:paises)
            dimensaoTotal += p.getDimensao();
        return dimensaoTotal;
    }

    public long getPopulacao(){
        long populacaoTotal = 0;
        for (Pais p:paises)
            populacaoTotal += p.getPopulacao();
        return populacaoTotal;
    }

    public double getDensidade(){
        double densidade = 0;
        for (Pais p:paises)
            densidade += p.getDensidade();
        return densidade;
    }

    public Pais getPaisMaisPopuloso(){
        if (!paises.isEmpty())
        {
            Pais maior = paises.get(0);
            for (int i = 0; i < paises.size(); i++)
                if (paises.get(i).getPopulacao() > maior.getPopulacao())
                    maior = paises.get(i);
            return maior;
        }
        return null;
    }

    public Pais getPaisMenosPopuloso(){
        if (!paises.isEmpty())
        {
            Pais menor = paises.get(0);
            for (int i = 0; i < paises.size(); i++)
                if (paises.get(i).getPopulacao() < menor.getPopulacao())
                    menor = paises.get(i);
            return menor;
        }
        return null;
    }

    public Pais getMenorPais(){
        if (!paises.isEmpty())
        {
            Pais menor = paises.get(0);
            for (int i = 0; i < paises.size(); i++)
                if (paises.get(i).getDimensao() < menor.getDimensao())
                    menor = paises.get(i);
            return menor;
        }
        return null;
    }

    public Pais getMaiorPais(){
        if (!paises.isEmpty())
        {
            Pais maior = paises.get(0);
            for (int i = 0; i < paises.size(); i++)
                if (paises.get(i).getDimensao() > maior.getDimensao())
                    maior = paises.get(i);
            return maior;
        }
        return null;
    }

    public double razaoMaiorMenorPais(){
        return getMaiorPais().getDimensao()/getMenorPais().getDimensao();
    }
}
