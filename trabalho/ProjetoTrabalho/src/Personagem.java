

public class Personagem {
    private String nome;
    private String raca;
    private String classe;
    private String genero;
    private int nivel;

    // Construtor
    public Personagem(String nome, String raca, String classe, String genero, int nivel) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.genero = genero;
        this.nivel = nivel;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}








