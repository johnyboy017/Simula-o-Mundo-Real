public class App {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa();
        joao.setNome("João Rocha");
        joao.setIdade(20);

        Pessoa harich = new Pessoa();
        harich.setNome("Guilherme Harich");
        harich.setIdade(23);

        Curintiano gustavo = new Curintiano();
        gustavo.setNome("Gustavo Henrique");
        gustavo.setIdade(26);

        harich.dizerOlaParaPessoa(joao);
        harich.dizerOlaParaPessoa(gustavo);
        harich.perguntarIdade();
        joao.falarIdade();
        gustavo.falarIdade();
        harich.perguntarSobreMina();
        joao.responderSobreMina();
        gustavo.responderSobreMina();
        harich.falarNomeMina();
        joao.responderNomeMina();
        gustavo.responderNomeMina();
        joao.finalizarConversa();
        gustavo.finalizarConversa();
        harich.aceitarWhats();
    }
}
