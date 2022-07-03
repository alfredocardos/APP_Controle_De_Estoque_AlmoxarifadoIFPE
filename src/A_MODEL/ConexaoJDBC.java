package A_MODEL;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoJDBC {
    //nome do usuário
    private static final String USERNAME = "postgres";

    //senha do banco
    private static final String PASSWORD = "Alfred@008";

    //caminho
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/almoxarifado";

    //Conexão com o db
    public static Connection createConnectionToMySQL() throws Exception {

            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);


            return connection;

    }
    public JdbcRowSet JDBC () throws SQLException {
        String USERNAME = "postgres";

        //senha do banco
        String PASSWORD = "Alfred@008";

        //caminho
        String DATABASE_URL = "jdbc:postgresql://localhost:5432/almoxarifado";
        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        return  jdbcRowSet;
    }

        public static void main (String[]args) throws Exception {

            //recupera conexão
            Connection con = createConnectionToMySQL();

            if (con != null) {
                System.out.println("Conexão obtida com sucesso");
                con.close();
            }
        }
    }

