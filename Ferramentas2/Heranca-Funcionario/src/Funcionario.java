public class Funcionario {
    private int ctps;
    private String nome;
    private int horasTrabalhadas;
    private double valorHora;


    public Funcionario(int ctps, String nome, int horasTrabalhadas, double valorHora){
        setCtps(ctps);
        setNome(nome);
        setHorasTrabalhadas(horasTrabalhadas);
        setValorHora(valorHora);
    }

    public Funcionario(int ctps, String nome) {
        this.ctps = ctps;
        this.nome = nome;
    }

    public int getCtps() {
        return ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if(horasTrabalhadas>=0)
            this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if(valorHora>=0)
            this.valorHora = valorHora;
    }

    public double getSalario(){
        return valorHora*horasTrabalhadas;
    }
}
