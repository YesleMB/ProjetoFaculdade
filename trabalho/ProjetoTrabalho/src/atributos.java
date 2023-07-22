import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class atributos extends skillsAtributos {
    private int nivel = 1;
    private String nome;
    private int genero;
    private int raca;
    private int classe;

    public int id;

    private String nomeClasse;
    private String nomeRaca;
    private String nomeGenero;

    public int getId() {
        return id;
    }

    public void setId(int idAtributos) {
        this.id = idAtributos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String valorNome) {

        this.nome = valorNome;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int nomeGenero) {
        this.genero = nomeGenero;
    }

    public int getRaca() {
        return raca;
    }

    public void setRaca(int nomeRaca) {
        this.raca = nomeRaca;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int nomeClasse) {

        this.classe = nomeClasse;
    }

    public int id() {
        int idAtributos;

        return id;
    }

    public String getStringRaca(int raca) {
        String nomeRaca = "";
        switch (raca) {
            case 1:
                nomeRaca = "humano";
                break;
            case 2:
                nomeRaca = "elfo";
                break;
            case 3:
                nomeRaca = "anao";
                break;
            default:
                nomeRaca = "Raca inválida";
                break;
        }
        return nomeRaca;
    }

    public String getStringGenero(int genero) {
        String nomeGenero = "";
        switch (genero) {
            case 1:
                nomeGenero = "masculino";
                break;
            case 2:
                nomeGenero = "feminino";
                break;
            case 3:
                nomeGenero = "nao binario";
                break;
            default:
                nomeGenero = "Genero inválido";
                break;
        }
        return nomeGenero;
    }

    public String getStringClasse(int classe) {
        String nomeClasse = "";
        switch (classe) {
            case 1:
                nomeClasse = "Paladino";
                break;
            case 2:
                nomeClasse = "Mago";
                break;
            case 3:
                nomeClasse = "Arqueiro";
                break;
            default:
                nomeClasse = "Classe inválida";
                break;
        }
        return nomeClasse;
    }

    public int EscolhaClasses() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha a classe (1: Paladino, 2: Mago, 3: Arqueiro): ");

        boolean validacao = false;
        do {
            try {
                this.classe = ler.nextInt();
                switch (this.classe) {
                    case 1:
                        nomeClasse = "";
                        validacao = true;
                        if (validacao) {
                            getClassPaladino();
                        }
                        break;
                    case 2:
                        nomeClasse = "";
                        validacao = true;
                        if (validacao) {
                            getClassMago();
                        }
                        break;
                    case 3:
                        nomeClasse = "";
                        validacao = true;
                        if (validacao) {
                            getClassArqueiro();
                        }
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (InputMismatchException i) {
                System.out.println("Entrada inválida! Certifique-se de digitar um número inteiro.");
            }
            ler.nextLine();
        } while (!validacao);
        return classe;

    }

    public int EscolhaRaca() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha uma raça (1: humano, 2: elfo, 3: anão): ");

        boolean validacao = false;
        do {
            try {
                this.raca = ler.nextInt();
                switch (this.raca) {
                    case 1:
                        nomeRaca = "";
                        validacao = true;
                        if (validacao) {
                            getRacaHumano();
                        }
                        break;
                    case 2:
                        nomeRaca = "";
                        validacao = true;
                        if (validacao) {
                            getRacaElfo();
                        }
                        break;
                    case 3:
                        nomeRaca = "";
                        validacao = true;
                        if (validacao) {
                            getRacaAnao();
                        }
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Certifique-se de digitar um número inteiro.");
                ler.nextLine();
            }
        } while (!validacao);
        return raca;

    }

    public int EscolhaGenero() {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha uma genero (1: masculino, 2: feminino, 3: não binario): ");

        boolean validacao = false;
        do {
            try {
                this.genero = ler.nextInt();
                switch (this.genero) {
                    case 1:
                        nomeGenero = "";
                        validacao = true;
                        break;
                    case 2:
                        nomeGenero = "";
                        validacao = true;
                        break;
                    case 3:
                        nomeGenero = "";
                        validacao = true;
                        break;

                    default:

                }
            } catch (InputMismatchException a) {
                System.out.println("Entrada inválida! Certifique-se de digitar um número inteiro.");
                ler.nextLine();
            }
        } while (!validacao);
        return genero;

    }

    public String getNomeRaca() {
        return null;
    }

    public String getNomeClasse() {
        return null;
    }

    public String getNomeGenero() {
        return null;
    }

    public void setGenero(String novoGenero) {
    }

    public void setClasse(String novaClasse) {
    }

    public void setRaca(String novaRaca) {
    }
 public void cadastrar() {
        Conexao conexao = new Conexao();
        Connection dbconn = null;
        PreparedStatement stmt = null;

        try {
            dbconn = conexao.openDadaBse();
            stmt = dbconn.prepareStatement(
                    "INSERT INTO personagem(nome, raca, classe, genero) VALUES (?, ?, ?, ?)");
            stmt.setString(1, this.getNome());
            stmt.setString(2, getStringRaca(this.getRaca()));
            stmt.setString(3, getStringClasse(this.getClasse()));
            stmt.setString(4, getStringGenero(this.getGenero()));
            stmt.executeUpdate();
            System.out.println("Atributos cadastrados com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar atributos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            conexao.closeDatabase(dbconn, stmt, null);
        }
    }

    public void editar(int idAtributos, String novoNome, int novaRaca, int novaClasse, int novoGenero) {
        Conexao conexao = new Conexao();
        Connection dbconn = null;
        PreparedStatement stmt = null;

        try {
            dbconn = conexao.openDadaBse();
            stmt = dbconn.prepareStatement(
                    "UPDATE personagem SET nome = ?, raca = ?, classe = ?, genero = ? WHERE id = ?");
            stmt.setString(1, novoNome);
            stmt.setInt(2, novaRaca);
            stmt.setInt(3, novaClasse);
            stmt.setInt(4, novoGenero);
            stmt.setInt(5, idAtributos);

            stmt.executeUpdate();
            System.out.println("Atributos atualizados com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar atributos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            conexao.closeDatabase(dbconn, stmt, null);
        }
    }

    public static ArrayList<atributos> listarTodos() {
        Conexao conexao = new Conexao();
        Connection dbconn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<atributos> listaDePersonagems = new ArrayList<>();

        try {
            dbconn = conexao.openDadaBse();
            stmt = dbconn.prepareStatement("SELECT * FROM personagem");
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String raca = rs.getString("raca");
                String classe = rs.getString("classe");
                String genero = rs.getString("genero");

                System.out.println("ID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Raça: " + raca);
                System.out.println("Classe: " +classe);
                System.out.println("Gênero: " +genero);
                System.out.println();

            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar personagens: " + e.getMessage());
            e.printStackTrace();
        } finally {
            conexao.closeDatabase(dbconn, stmt, rs);
        }

        return listaDePersonagems;
    }
    public static ArrayList<atributos> listarApenas() {
    Conexao conexao = new Conexao();
    Connection dbconn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    ArrayList<atributos> listaDePersonagems = new ArrayList<>();
    
    try {
        dbconn = conexao.openDadaBse();
        stmt = dbconn.prepareStatement("SELECT * FROM personagem");
        rs = stmt.executeQuery();

        while (rs.next()) {
            atributos personagem = new atributos();
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            personagem.setId(id);
            personagem.setNome(nome);
          

            listaDePersonagems.add(personagem);
        }
    } catch (SQLException e) {
        System.out.println("Erro ao listar personagens: " + e.getMessage());
        e.printStackTrace();
    } finally {
        conexao.closeDatabase(dbconn, stmt, rs);
    }

    return listaDePersonagems;
}


    public void excluir(int idAtributos) {
        Conexao conexao = new Conexao();
        Connection dbconn = null;
        PreparedStatement stmt = null;

        try {
            dbconn = conexao.openDadaBse();
            stmt = dbconn.prepareStatement("DELETE FROM personagem WHERE id = ?");
            stmt.setInt(1, idAtributos);

            stmt.executeUpdate();
            System.out.println("Personagem excluído do banco de dados com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir personagem do banco de dados: " + e.getMessage());
            e.printStackTrace();
        } finally {
            conexao.closeDatabase(dbconn, stmt, null);
        }
    }

}
   


