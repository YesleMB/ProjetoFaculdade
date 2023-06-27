public class Personagem extends atributos {
    private String nome;
    private int raca ;
    private int classe;
    private int genero ;
    private int id;


    public Personagem(String nome, int raca, int classe, int genero, int id) {
        //super();
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.genero = genero;
        
    }
   
    public void criarPersonagem(){
        Personagem();

    }
    









    

    public void cadastrar() {
        String sql = "INSERT INTO personagem (nome, raca, classe) VALUES ('" +
                     this.getNome() + "', " +
                     this.getRaca() + ", " +
                     this.getClasse() + ")";
        Conexao.executar(sql);
    }

    public void editar() {
        String sql = "UPDATE personagem SET " +
                     "nome = '" + this.getNome() + "', " +
                     "raca = " + this.getRaca() + ", " +
                     "classe = " + this.getClasse() + " " +
                     "WHERE id = " + this.getId();
        Conexao.executar(sql);
    }

    public static void excluir(int idPersonagem) {
        String sql = "DELETE FROM personagem WHERE id = " + idPersonagem;
        Conexao.executar(sql);
    }
}





