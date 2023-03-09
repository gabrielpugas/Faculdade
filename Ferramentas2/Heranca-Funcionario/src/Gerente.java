public class Gerente extends Funcionario{
    private double adicional;
    public Gerente (int ctps, String nome, int horasTrabalhadas, double valorHora, double adicional) {
        super(ctps,nome,horasTrabalhadas,valorHora);
        this.adicional = adicional;
    }

    public Gerente(int ctps, String nome, double adicional) {
        super(ctps, nome);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public double getSalario(){
        return getValorHora()*getHorasTrabalhadas()*(1+adicional);
    }
}
