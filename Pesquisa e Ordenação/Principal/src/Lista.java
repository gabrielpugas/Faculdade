public class Lista {
    public No inicio;
    private No fim;

    public Lista(){ }
    public void Inicializa(){
        inicio = fim = null;
    }
    public void InserirNoInicio(int info){
        No nova = new No(info,null,inicio);
        if(inicio==null)
            inicio=fim=nova;
        else {
            inicio.setAnt(nova);
            inicio = nova;
        }
    }
    public void InserirNoFinal(int info){
        No nova = new No(info,fim,null);
        if(inicio==null)
            inicio=fim=nova;
        else {
            fim.setProx(nova);
            fim = nova;
        }
    }
    public void Exibir(){
        No aux = inicio;
        while(aux!=null){
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
    }
    public No BuscaExaustiva(int info){
        No aux = inicio;
        while(aux.getInfo()!=info && aux!=null)
            aux = aux.getProx();
        if(aux!=null && aux.getInfo()==info)
            return aux;
        return null;
    }
    public void Remover(int info){
        No aux = new No(0,null, null);
        aux = BuscaExaustiva(info);
        if(aux==null)
            System.out.println("Informação não encontrada");
        else
            if(aux==inicio && aux==fim)
                Inicializa();
            else
                if(aux == inicio) {
                    inicio = inicio.getProx();
                    inicio.setAnt(null);
                }
                else
                    if(aux == fim){
                        fim = fim.getAnt();
                        fim.setProx(null);
                    }
                    else{
                        aux.getAnt().setProx(aux.getProx());
                        aux.getProx().setAnt(aux.getAnt());
                    }
    }
    public void InsercaoDireta(){
        No i = inicio.getProx(), pos;
        int aux;
        while(i!=null){
            pos = i;
            aux = pos.getInfo();
            while(pos!=inicio && aux<pos.getAnt().getInfo()){
                pos.setInfo(pos.getAnt().getInfo());
                pos = pos.getAnt();
            }
            pos.setInfo(aux);
            i = i.getProx();
        }
    }
    public No BuscaBinaria(int info){
        No esquerda, direita, meio;
        return null;
    }
}
