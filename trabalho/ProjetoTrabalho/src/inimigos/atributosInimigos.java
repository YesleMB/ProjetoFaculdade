package inimigos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;




public class atributosInimigos {
    private int tipo;
    private int raca;
    private int nomeInimigo;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    private String EscolhaTipo;
    private String EscolhaRaca;
    private String EscolhaNomeInimigo;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getRaca() {
        return raca;
    }

    public void setRaca(int raca) {
        this.raca = raca;
    }

    public int getNomeInimigo() {
        return nomeInimigo;
    }

    public void setNomeInimigo(int nomeInimigo) {
        this.nomeInimigo = nomeInimigo;
    }
    public void setIdFromDatabase(int id) {
        this.id = id;
    }
    

    public String geStringTipo  (int tipo) {
        String escolhaTipo = "";
        switch (tipo) {
            case 1:
                escolhaTipo = "longo alcance";
                break;
            case 2:
                escolhaTipo = "corpo a corpo";
                break;
            default:
                break;
        }
        return escolhaTipo;
    }
    
    public String getStringRaca(int raca) {
        String EscolhaRaca = "";
        switch (raca) {
            case 1:
                EscolhaRaca = "orc";
                break;
            case 2:
                EscolhaRaca = "goblin";
                break;
            default:
                break;
        }
        return EscolhaRaca;
    }
    
    public String getStringNomeInimigo(int nomeInimigo) {
        String EscolhaNomeInimigo = "";
        switch (nomeInimigo) {
            case 1:
                EscolhaNomeInimigo = "Grommash";
                break;
            case 2:
                EscolhaNomeInimigo = "Drogath";
                break;
            case 3:
                EscolhaNomeInimigo = "Zigzag";
                break;
            default:
                break;
        }
        return EscolhaNomeInimigo;
    }


    public int EscolhaTipo(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha um tipo de ataque para sua criação\n 1 - longo alcance 2 - corpo a corpo ");
        boolean validacao = false;
        do{
            try{ this.tipo = ler.nextInt();
            switch(this.tipo){
                case 1: EscolhaTipo = geStringTipo(1);
                        validacao = true;
                        if( validacao){
                          
                        }
                        break;
                case 2:  EscolhaTipo = geStringTipo(2);
                        validacao = true;
                        if( validacao){

                         }
                         default: 
                    break; 
            }
             }catch(InputMismatchException q){
            System.out.println("informe um numero valido, valor anteriormente informado invalido");
        }ler.nextLine();
             }while (!validacao); 
        return tipo; 
    } 
    public int EscolhaRaca(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha uma raça para sua criação\n 1 - orc   2 - goblin ");
        boolean validacao = false;
        do{
            try{ this.raca = ler.nextInt();
            switch(this.raca){
                case 1: EscolhaRaca = getStringRaca(1);
                        validacao = true;
                        if( validacao){
                          
                        }
                        break;
                case 2: EscolhaRaca = getStringRaca(2);
                        validacao = true;
                        if( validacao){

                         }
                         default: 
                    break; 
            }
             }catch(InputMismatchException w){
            System.out.println("informe um numero valido, valor anteriormente informado invalido");
        }ler.nextLine();
             }while (!validacao); 
        return tipo; 
    }  
      public int EscolhaNomeInimigo(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha uma nome para sua criação\n 1 - Grommash   2 - Drogath  3 - Zigzag ");
        boolean validacao = false;
        do{
            try{ this.nomeInimigo = ler.nextInt();
            switch(this.nomeInimigo){
                case 1: EscolhaNomeInimigo = getStringNomeInimigo(1);
                        validacao = true;
                        if( validacao){
                          
                        }
                        break;
                case 2:  EscolhaNomeInimigo = getStringNomeInimigo(2);
                        validacao = true;
                        if( validacao){

                         }
                         break;
                case 3: EscolhaNomeInimigo = getStringNomeInimigo(3);
                        validacao = true;
                        if( validacao){

                         }
                         break;        
                         default: 
                    break; 
            }
             }catch(InputMismatchException s){
            System.out.println("informe um numero valido, valor anteriormente informado invalido");
        }ler.nextLine();
             }while (!validacao); 
        return tipo; 
    }  
    
    public void cadastrar() {
        Conexao conexao = new Conexao();
        Connection dbconn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
        try {
            dbconn = conexao.openDadaBse();
            stmt = dbconn.prepareStatement("INSERT INTO inimigo (tipo, raca, nomeInimigo) VALUES (?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);
    
            stmt.setString(1, geStringTipo(this.getTipo()));
            stmt.setString(2, getStringRaca(this.getRaca()));
            stmt.setString(3, getStringNomeInimigo(this.getNomeInimigo()));
    
            int rowsAffected = stmt.executeUpdate();
    
            // Verifica se alguma linha foi afetada pela inserção
            if (rowsAffected > 0) {
                rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    this.setId(id);
                }
                System.out.println("Atributos cadastrados com sucesso!");
            } else {
                System.out.println("Erro ao cadastrar atributos. Nenhum registro foi inserido.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar atributos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            conexao.closeDatabase(dbconn, stmt, rs);
        }
    }
    

    public static ArrayList<atributosInimigos> listaInimigos() {
        Conexao conexao = new Conexao();
        Connection dbconn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
        ArrayList<atributosInimigos> listaDeInimigos = new ArrayList<>();
    
        try {
            dbconn = conexao.openDadaBse();
            stmt = dbconn.prepareStatement("SELECT * FROM inimigo");
            rs = stmt.executeQuery();
    
            while (rs.next()) {
                int id = rs.getInt("id");
                String tipo = rs.getString("tipo");
                String raca = rs.getString("raca");
                String nomeInimigo = rs.getString("nomeInimigo");
    
                atributosInimigos inimigo = new atributosInimigos();
                listaDeInimigos.add(inimigo);
    
                System.out.println("ID: " + id);
                System.out.println("tipo: " + tipo);
                System.out.println("Raça: " + raca);
                System.out.println("nomeInimigo: " + nomeInimigo);
                System.out.println();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar inimigos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            conexao.closeDatabase(dbconn, stmt, rs);
        }
    
        return listaDeInimigos;
    }
    public static ArrayList<atributosInimigos> listaParaDeletar() {
        Conexao conexao = new Conexao();
        Connection dbconn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<atributosInimigos> listaDeInimigos = new ArrayList<>();
        
        try {
            dbconn = conexao.openDadaBse();
            stmt = dbconn.prepareStatement("SELECT * FROM inimigo");
            rs = stmt.executeQuery();
    
            while (rs.next()) {
                atributosInimigos inimigos = new atributosInimigos();
                int id = rs.getInt("id");
                String nomeInimigo = rs.getString("nomeInimigo");
                inimigos.setId(id);
              
    
                listaDeInimigos.add(inimigos);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar personagens: " + e.getMessage());
            e.printStackTrace();
        } finally {
            conexao.closeDatabase(dbconn, stmt, rs);
        }
    
        return listaDeInimigos;
    }
    
    public void excluir(int id) {
        Conexao conexao = new Conexao();
        Connection dbconn = null;
        PreparedStatement stmt = null;

        try {
            dbconn = conexao.openDadaBse();
            stmt = dbconn.prepareStatement("DELETE FROM inimigo WHERE id = ?");
            stmt.setInt(1, id);

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
