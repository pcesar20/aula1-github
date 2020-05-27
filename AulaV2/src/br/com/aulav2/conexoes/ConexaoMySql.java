
package br.com.aulav2.conexoes;


import java.sql.Connection;    //Classe responsável pela conexão com o driver do banco de dados
import java.sql.DriverManager; //Classe responsável por estabelecer a conexão física entre a aplicação e o banco de dados
import java.sql.ResultSet;     //Classe responsável por encapsular o retorno do processamento no sentido SGBD para APLICAÇÃO
import java.sql.Statement;     //Classe responsável por encapsular o retorno do processamento no sentido APLICAÇÃO para SGBD
import java.sql.SQLException;  //Tratamento de exceções para SQL

public class ConexaoMySql {
    //Parâmetros necessários para que a aplicação integre com o SGBD
    private Connection c;        //Criar uma instância do objeto de conexão (Connection)
    private String driverJdbc;   //Nome do driver JDBC
    private ResultSet resultSet; //Objeto de envio de resposta do SGBD para à aplicação
    private Statement statement; //Objeto de envio de requisições da aplicação para o SGBD
    private String strConexao;   //String de conexão ao banco de dados
    
    private String local;        //Local do servidor do banco de dados
    private String porta;        //Porta de serviço do servidor do banco de dados
    private String banco;        //Nome do banco de dados
    private String usuario;      //Usuário que a conexão usará para se conectar ao banco de dados
    private String senha;        //Senha do usuário

    public ConexaoMySql(){
    }

    public ConexaoMySql(String local, String porta, String banco, String usuario, String senha) {
        setLocal(local);
        setPorta(porta);
        setBanco(banco);
        setUsuario(usuario);
        setSenha(senha);
        setStrConexao("jdbc:mysql://" + getLocal() + ":" + getPorta() + "/" + getBanco());
        setDriverJdbc("com.mysql.jdbc.Driver");
    }

    //Conectar ao banco de dados
    public void conectar() {
        try {
            Class.forName(getDriverJdbc());
            setC(DriverManager.getConnection(getStrConexao(), getUsuario(), getSenha()));
            setStatement(getC().createStatement());            
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }

    //Desconectar ao banco de dados
    public void desconectar() {
        try {
            getC().close();
        } catch (SQLException e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }
    
    public Connection getC() {
        return c;
    }

    public void setC(Connection c) {
        this.c = c;
    }

    public String getDriverJdbc() {
        return driverJdbc;
    }

    public void setDriverJdbc(String driverJdbc) {
        this.driverJdbc = driverJdbc;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public String getStrConexao() {
        return strConexao;
    }

    public void setStrConexao(String strConexao) {
        this.strConexao = strConexao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}

