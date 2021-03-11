public class Curintiano extends Pessoa {

    @Override
    public void dizerOla() {
        System.out.println(this.getNome() + ": Eae mano, vai Curintia!");
    }

    @Override
    public void falarIdade() {
        System.out.println(this.getNome() + ": Já eu tenho " + this.getIdade());
    }

    @Override
    public void responderSobreMina() {
        System.out.println(this.getNome() + ": Não vi tbm não mano, pq? ");
    }

    @Override
    public void responderNomeMina() {
        System.out.println(this.getNome() + ": Bora kkkkk ");
        System.out.println(this.getNome() + ": Vamo mandar msg pra ela. Vou tentar pegar o whats dela e ai a gente manda pro Harich fazer a parte dele. ");
    }

    @Override
    public void finalizarConversa() {
        System.out.println(this.getNome() + ": Demoro. A gente se fala dps entao. Flw. ");
        System.out.println(this.getNome() + ": Vou te mandar o whats hein Harich, ai vc faz a sua parte! Flw. ");
    }
}
