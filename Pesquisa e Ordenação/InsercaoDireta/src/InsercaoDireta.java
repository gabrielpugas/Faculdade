public class PesquisaEOrdenacao {
    public int TL;
    public int[] vet;

    }
    public void insercao_direta(){
        int aux, pos;
        for(int i = 1; i < TL; i++){
            aux = vet[i];
            pos = i;
            while(pos>0 && aux<vet[pos-1]){
                vet[pos]=vet[pos-1];
                pos--;
            }
            vet[pos] = aux;
        }
    }

    public void insercao_direta_ponteiros(){
        int aux;
        No pi = inicio.getProx(), ppos;

        while(pi!=null){
            aux = pi.getInfo();
            ppos = pi;
            while(ppos!=inicio && aux < ppos.getAnt().getInfo()){
                ppos.setInfo(ppos.getAnt().getInfo());
                ppos = ppos.getAnt();
            }
            ppos.setInfo(aux);
            pi = pi.getProx();
        }
    }
}
