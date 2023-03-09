import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> equipe = new ArrayList<Funcionario>();
        Funcionario f1 = new Funcionario(1010, "Gabriel Pugas", 210, 15);
        //System.out.println("Salario do "+f1.getNome()+": R$"+ f1.getSalario());

        Gerente g1 = new Gerente(2020, "Federico Bergollio", 210, 15, 0.25);
        //System.out.println("Salario do "+g1.getNome()+": R$"+ g1.getSalario());

        equipe.add(f1);
        equipe.add(g1);



        for (Funcionario funcionario:equipe
             ) {
            mostraInfo(funcionario);
        }
    }

    static void mostraInfo(Funcionario funcionario) {
        System.out.println("Salario do "+funcionario.getNome()+": R$"+ funcionario.getSalario());
        if(funcionario instanceof Gerente)
            System.out.println("    Com adicional de "+ ((Gerente) funcionario).getAdicional()+"%.");
    }
}
