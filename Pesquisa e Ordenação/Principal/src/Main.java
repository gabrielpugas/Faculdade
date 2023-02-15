public class Main {
    public static void main(String[] args) {
        int[] vetor = {1,5,3,6,8,0};
        int TL = vetor.length;
        Lista lista = new Lista();
        lista.Inicializa();

        for (int i = 0; i < TL; i++) {
            lista.InserirNoInicio(vetor[i]);
        }

        lista.Remover(8);
        lista.Exibir();
        lista.InsercaoBinaria();
    }
}
