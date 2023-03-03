public class Lista {
    public No inicio;
    private No fim;

    public Lista() {
    }

    public void Inicializa() {
        inicio = fim = null;
    }

    public void InserirNoInicio(int info) {
        No nova = new No(info, null, inicio);
        if (inicio == null)
            inicio = fim = nova;
        else {
            inicio.setAnt(nova);
            inicio = nova;
        }
    }

    public void InserirNoFinal(int info) {
        No nova = new No(info, fim, null);
        if (inicio == null)
            inicio = fim = nova;
        else {
            fim.setProx(nova);
            fim = nova;
        }
    }

    public void Exibir() {
        No aux = inicio;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }

    public No BuscaExaustiva(int info) {
        No aux = inicio;
        while (aux.getInfo() != info && aux != null)
            aux = aux.getProx();
        if (aux != null && aux.getInfo() == info)
            return aux;
        return null;
    }

    public void Remover(int info) {
        No aux = new No();
        aux = BuscaExaustiva(info);
        if (aux == inicio && aux == fim)
            Inicializa();
        else if (aux == inicio) {
            inicio = inicio.getProx();
            inicio.setAnt(null);
        } else if (aux == fim) {
            fim = fim.getAnt();
            fim.setProx(null);
        } else {
            aux.getAnt().setProx(aux.getProx());
            aux.getProx().setAnt(aux.getAnt());
        }
    }

    public void InsercaoDireta() {
        No i = inicio.getProx(), pos;
        int aux;
        while (i != null) {
            pos = i;
            aux = pos.getInfo();
            while (pos != inicio && aux < pos.getAnt().getInfo()) {
                pos.setInfo(pos.getAnt().getInfo());
                pos = pos.getAnt();
            }
            pos.setInfo(aux);
            i = i.getProx();
        }
    }

    public int BuscaBinaria(int chave, int TL) {
        int inicio = 0, fim = TL-1, meio = fim/2;
        while(1==0){

        }
        if(chave > vet[meio])
            return meio + 1;
        return meio;
    }

    public int TamanhoParteOrdenada(No i){
        int tamanho=0;
        while(i!=null){
            i = i.getAnt();
            tamanho++;
        }
        return tamanho;
    }
    public void InsercaoBinaria() {
        No i = inicio.getProx();
        No aux2 = i;
        int aux, pos;
        while(i != null){
            aux = i.getInfo();
            pos = BuscaBinaria(aux, TamanhoParteOrdenada(i));
        }
    }

    public void BubbleSort(){
        int TL = filesize();
        Registro reg1 = new Registro();
        Registro reg2 = new Registro();
        while(TL>1){
            for(int i=0; i<TL-1;i++){
                seekArq(i);
                reg1.leDoArq(arquivo);
                reg2.leDoArq(arquivo);
                if(reg1.getCodigo()>reg2.getCodigo()){
                    seekArq(i);
                    reg2.gravaNoArq(arquivo);
                    reg1.gravaNoArq(arquivo);
                }
            }
        }
        TL--;
    }
}