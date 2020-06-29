
package control;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author maicon
 */
public class conection {
    public Statement stm;//devem ser acessadas de outros lugares do software--- realiza pesquisa no BD.
    public ResultSet rs;//--- armazena resultado da pesquisa.
    private String driver = "org.postgresql.Driver";//devem ser acessadas somente nesta classe--- identifica o serviço de BD
    private String caminho = "jdbc:postgresql://localhost:5432/system_math";// indica o caminho do BD.
    private String usuario = "postgres";// usuário do banco de dados
    private String senha = "felipe01";// senha do banco de dados.
    private Connection con;// realiza a conexão com o BD
    
    public void conexao(){
        System.setProperty("jdbc.Drivers", driver);//responsável por setar a propriedade do driver de conexão.
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Connection OK");
        } catch (SQLException ex) {
            Logger.getLogger(conection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Connection ERROR");
        }
    }
    
}
