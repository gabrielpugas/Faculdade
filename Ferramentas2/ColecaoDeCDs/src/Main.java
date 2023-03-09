public class Main {
    public static void main(String[] args) {
        Acervo acervo = new Acervo();
        CD cdAttention = new CD("Attention","Miley Cyrus",1971);
        cdAttention.addFaixa(new Musica("We Can't Stop",3.5));
        acervo.addCD(cdAttention);
        acervo.getCds();
        cdAttention.getFaixas();
        acervo.getCds();
    }
}
