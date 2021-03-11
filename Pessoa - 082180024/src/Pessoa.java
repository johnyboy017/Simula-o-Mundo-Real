public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void dizerOla() {
        System.out.println(this.nome + ": Olá!");
    }

    public void dizerOlaParaPessoa(Pessoa pessoa) {
        System.out.println(this.nome + ": Olá " + pessoa.getNome());
        pessoa.dizerOla();
    }

    public void perguntarIdade() {
        System.out.println(this.nome + ": Quantos anos vcs tem? ");
        System.out.println(this.nome + ": Eu tenho " + this.idade + " anos.");
    }

    public void falarIdade() {
        System.out.println(this.nome + ": Eu tenho " + this.idade + " anos.");
    }

    
    public void perguntarSobreMina() {
        System.out.println(this.nome + ": Podepa. Viram a mina nova que entrou na nossa sala? ");
    }

    public void responderSobreMina() {
        System.out.println(this.nome + ": Nem vi mano, qual o nome dela? ");
    }

    public void falarNomeMina() {
        System.out.println(this.nome + ": Acho q é Rosana. ");
        System.out.println(this.nome + ": Achei ela bonita. Vou mandar o insta delas pra vcs verem. Vcs n acharam ela bonita? ");
    }

    public void responderNomeMina() {
        System.out.println(this.nome + ": Vou ver aqui... ");
        System.out.println(this.nome + ": Achei ela bonita sim. Vamo arrumar ela pra ele então? kkkkkkkkk ");
    }

    public void finalizarConversa() {
        System.out.println(this.nome + ": Demoro kkkkkk ");
        System.out.println(this.nome + ": Vou ter q sair rapaziada, dps a gente se fala. Flw ");
    }

    public void aceitarWhats() {
        System.out.println(this.nome + ": Podepa kkkkkkk. Vlw rapaziada pela ajuda. Tamo junto. ");
        System.out.println(this.nome + ": Flw. Até mais! ");
    }
}
