public class Main {
    public static void main(String[] args) {
        Acervo acervo = new Acervo();
        CD cdAttention = new CD("Attention","Miley Cyrus",1971);
        acervo.addCD(cdAttention);
        cdAttention.addMusica(new Musica("We Can't Stop",3.5));
    }
}
