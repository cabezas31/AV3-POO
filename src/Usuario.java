public abstract class Usuario {
    private String nome;
    private String matricula;

    public Usuario(String matricula, String nome) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public abstract void realizarAcao();

    public String toString() {
        return "nome: "+ nome+ ", matricula: "+ matricula;
    }
}
